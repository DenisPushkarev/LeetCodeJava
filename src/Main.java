import dip.leetcode.solutions.Solution118;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution118 s = new Solution118();
        List<List<Integer>> list = s.generate(1);
        print(list);
        System.out.println();
        print(s.generate(2));
        System.out.println();
        print(s.generate(10));
    }

    static void print(List<List<Integer>> list) {

        for (List<Integer> l : list) {
            System.out.println(Arrays.toString(l.toArray()));
        }
    }
}
