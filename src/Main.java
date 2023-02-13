import dip.leetcode.solutions.Solution121;
public class Main {

    public static void main(String[] args) {
        int[] a = {6,3,7,2,3,3};
        Solution121 s121 = new Solution121();
        int r = s121.maxProfit(a);
        System.out.println("r = " + r);
    }
}