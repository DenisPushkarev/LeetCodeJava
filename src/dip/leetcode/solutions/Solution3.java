package dip.leetcode.solutions;

public class Solution3 {
  public int lengthOfLongestSubstring(String s) {
    int[] set = new int[96];
    int left = 0;
    int c, max = 0;
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i) - 32;
      while (set[c] > 0) {
        int r = s.charAt(left) - 32;
        set[r]--;
        left++;
      }
      set[c]++;
      max = Math.max(max, i - left + 1);
    }
    return max;
  }
}