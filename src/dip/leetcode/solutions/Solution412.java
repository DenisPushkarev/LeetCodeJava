package dip.leetcode.solutions;

import java.util.List;
import java.util.Arrays;

public class Solution412 {
  public List<String> fizzBuzz(int n) {
    String[] result = new String[n];
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizz_buzz = "FizzBuzz";
    for (int i = 0; i < result.length; i++) {
      String s = Integer.toString(i + 1);
      if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
        s = fizz_buzz;
      } else if ((i + 1) % 3 == 0) {
        s = fizz;
      } else if ((i + 1) % 5 == 0) {
        s = buzz;
      }
      result[i] = s;
    }
    return Arrays.asList(result);
  }
}