package dip.leetcode.solutions;

public class Solution204 {
  public int countPrimes(int n) {
    if (n < 3)
      return 0;
    boolean[] not_a_prime_number = new boolean[n];
    for (int i = 2; i * i < not_a_prime_number.length; i++) {
      if (not_a_prime_number[i] == false) {
        for (int j = i; (j * i) < not_a_prime_number.length; j++) {
          not_a_prime_number[i * j] = true;
        }
      }
    }
    int result = 0;
    for (int i = 2; i < n; i++) {
      if (!not_a_prime_number[i]) {
        result++;
      }
    }
    return result;
  }
}