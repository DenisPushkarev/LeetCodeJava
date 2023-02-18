package dip.leetcode.solutions;

public class Solution191 {
  public int hammingWeight(int n) {
    int cnt = 0;
    int mask = 1;
    for (int i = 0; i<32; i++) {
      if ((n & mask) == mask) cnt++;
      mask = mask << 1;
    }
    return cnt;
  }
}
