package dip.leetcode.solutions;

public class Solution3 {
  public int lengthOfLongestSubstring(String s) {
    String substr = "", tmpString = "";
    for (int i = 0; i < s.length(); i++) {
      for (int j = i+1; j <= s.length(); j++) {
        tmpString = s.substring(i, j);
        // System.out.println(" tmpString: " + tmpString);
        if (hasRepeated(tmpString))
          break;
        else if (tmpString.length() > substr.length())
          substr = tmpString;
      }
      // System.out.println("substr: " + substr);
    }
    return substr.length();
  }

  boolean hasRepeated(String s) {
    if (s.length() <= 1)
      return false;
    char lc = s.charAt(s.length() - 1);
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == lc)
        return true;
    }
    return false;
  }
}
