import dip.leetcode.solutions.Solution4;

public class Main {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(" result: " + 
                s.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
        System.out.println(" result: " + 
                s.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
    }
}
