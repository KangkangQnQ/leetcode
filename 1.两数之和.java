/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[] { hashMap.get(nums[i]), i };
            } else {
                hashMap.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}
// @lc code=end
