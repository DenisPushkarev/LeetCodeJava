package dip.leetcode.solutions;

import java.util.List;
import java.util.ArrayList;

public class Solution412 {
  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<String>(n);
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizz_buzz = "FizzBuzz";
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add(fizz_buzz);
      } else if ((i) % 3 == 0) {
        result.add(fizz);
      } else if ((i) % 5 == 0) {
        result.add(buzz);
      } else {
        result.add(Integer.toString(i));
      }
    }
    return result;
  }
}