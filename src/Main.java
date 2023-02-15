import dip.leetcode.solutions.Solution384;

public class Main {

    public static void main(String[] args) {
        int[] input = {1, 2};
        Solution384 solution = new Solution384(input);
        int[] result = solution.shuffle();
        System.out.println("result: " + Solution384.toString(result));
    }
}