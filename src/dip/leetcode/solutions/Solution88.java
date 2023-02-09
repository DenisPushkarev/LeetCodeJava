package dip.leetcode.solutions;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        n--;
        m--;
        for (int i = nums1.length - 1; i > -1; i--) {
            if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (n < 0) {
                nums1[i] = nums1[m--];
            } else if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
        }
    }
}