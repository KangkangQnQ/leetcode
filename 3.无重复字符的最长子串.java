/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int front = 0;
        int length = s.length();
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // hashMap.put(s.charAt(0), 0);
        for (int back = 0; back < length; back++) {
            if (hashMap.containsKey(s.charAt(back))) {
                front = Math.max(hashMap.get(s.charAt(back)) + 1, front);
                // front = hashMap.get(s.charAt(back)) + 1;
            }
            // 不要加else
            // else {
            max = Math.max(max, back - front + 1);
            hashMap.put(s.charAt(back), back);
            // }
        }
        return max;
    }
}
// @lc code=end
