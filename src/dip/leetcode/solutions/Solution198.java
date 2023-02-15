package dip.leetcode.solutions;

public class Solution198 {
    public int rob(int[] nums) {
        int[] maxs = new int[nums.length + 1];
        maxs[0] = 0;
        maxs[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxs[i + 1] = Math.max(maxs[i - 1] + nums[i], maxs[i]);
        }
        return maxs[maxs.length - 1];
    }
}
