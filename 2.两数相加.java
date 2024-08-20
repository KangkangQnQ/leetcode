/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Copy = l1;
        ListNode l2Copy = l2;
        int base = 1;
        ListNode res = new ListNode(0);
        ListNode head = res;
        int c = 0;
        while (l1Copy != null || l2Copy != null) {
            int a = l1Copy != null ? l1Copy.val : 0;
            int b = l2Copy != null ? l2Copy.val : 0;
            int d = (a + b + c) % 10;
            c = (a + b + c) / 10;
            res.next = new ListNode(d);
            res = res.next;
            if (l1Copy != null) {
                l1Copy = l1Copy.next;
            }
            if (l2Copy != null) {
                l2Copy = l2Copy.next;
            }

        }
        // 最后进位
        if (c != 0) {
            res.next = new ListNode(c);
            res = res.next;
        }
        res.next = null;
        return head.next;
    }
}
// @lc code=end
