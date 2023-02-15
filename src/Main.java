import dip.leetcode.solutions.Solution53;

public class Main {

    public static void main(String[] args) {
//        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] input = {5,4,-1,7,8};
        int[] input = {1};
        int result = new Solution53().maxSubArray(input);
        System.out.println("result: " + result);
    }
}