package dip.leetcode.solutions;

import java.util.List;
import java.util.ArrayList;

public class Solution118 {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> prev = new ArrayList<>();
    prev.add(1);
    list.add(prev);
    for (int i = 1; i < numRows; i++) {
      List<Integer> sub_list = new ArrayList<Integer>();
      sub_list.add(1);
      for (int j = 1; j < i; j++) {
        Integer num = prev.get(j - 1) + prev.get(Math.min(j, prev.size() - 1));
        sub_list.add(num);
      }
      sub_list.add(1);
      list.add(sub_list);
      prev = sub_list;
    }
    return list;
  }
}
