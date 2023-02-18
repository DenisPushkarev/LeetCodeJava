import dip.leetcode.solutions.Solution326;

public class Main {

    public static void main(String[] args) {
        int[] q = { 3, 4, 9, 27, 100 };
        Solution326 pow = new Solution326();
        for (int i = 0; i < q.length; i++) {
            System.out.println("" + q[i] + ": " + pow.isPowerOfThree(q[i]));
        }

    }

}