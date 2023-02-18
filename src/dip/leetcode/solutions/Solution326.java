package dip.leetcode.solutions;

public class Solution326 {
  public boolean isPowerOfThree(int n) {
    int max = 1162261467; // 3**19;
    return n > 0 && (max % n == 0);
  }

  public boolean isPowerOfThreeBF(int n) {
    if (n < 1)
      return false;
    if (n == 1)
      return true;
    int i = 3;
    for (i = 3; i < n; i = i * 3)
      ;
    if (i == n)
      return true;
    else
      return false;
  }
}
