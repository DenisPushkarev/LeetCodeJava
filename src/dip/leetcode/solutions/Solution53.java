package dip.leetcode.solutions;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0], cur_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur_sum = Math.max(cur_sum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, cur_sum);

        }
        return max_sum;
    }

    private int sum(int[] nums, int start, int finish) {
        int sum = Integer.MIN_VALUE;
        for (int i = start; i < finish; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int maxSubArrayBF(int[] nums) {
        int sum = Integer.MIN_VALUE, tmp;
        for (int i = 0; i < nums.length; i++) {
            tmp = 0;
            for (int j = i; j < nums.length; j++) {
                tmp += nums[j];
                sum = Math.max(tmp, sum);
            }
        }
        return sum;
    }

}
