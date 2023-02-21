package dip.leetcode.solutions;

public class Solution190 {
  public int reverseBits(int n) {
    int result = 0, b = 0;
    for (int i = 0; i < 32; i++) {
      b = (n >> i) & 1;
      result = result | (b << 31 - i);
    }
    return result;
  }
}
