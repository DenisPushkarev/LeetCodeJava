package dip.leetcode.solutions;

public class Solution4 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = 0, m = 0, r = 0, r1 = 0, ptr1 = 0, ptr2 = 0;
    for (int i = 0; i <= ((nums1.length + nums2.length) / 2); i++) {
      n = nums1.length > ptr1 ? nums1[ptr1] : Integer.MAX_VALUE;
      m = nums2.length > ptr2 ? nums2[ptr2] : Integer.MAX_VALUE;
      r1 = r;
      if (n < m) {
        r = n;
        ptr1++;
      } else {
        r = m;
        ptr2++;
      }
    }
    if ((nums1.length + nums2.length) % 2 == 0) {
      return (1d * r + r1) / 2;

    } else {
      return 1d * r;
    }
  }
}
