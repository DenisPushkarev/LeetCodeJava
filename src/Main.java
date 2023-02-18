
import dip.leetcode.solutions.Solution191;
public class Main {

    public static void main(String[] args) {
        Solution191 s191 = new Solution191();
        int n = 0b11111111111111111111111111111101;
        System.out.println("n: " + n);
        System.out.println(s191.hammingWeight(0b11111111111111111111111111111101));
    }

}