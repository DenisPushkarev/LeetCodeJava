package dip.leetcode.solutions;


import dip.leetcode.tree.TreeNode;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return treeNodeHelper(nums, 0, nums.length - 1);
    }

    private TreeNode treeNodeHelper(int[] nums, int left, int right) {
        if (left > right ) return null;
        int k = left + (right - left) / 2;
        return new TreeNode(nums[k], treeNodeHelper(nums, left, k-1), treeNodeHelper(nums, k+1, right));
    }
}
