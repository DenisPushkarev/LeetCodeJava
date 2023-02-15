package dip.leetcode.solutions;

import java.util.Random;

public class Solution384 {
    int[] nums;

    public Solution384(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] shuffled = nums.clone();
        int rnd, tmp;
        for (int i = 0; i < shuffled.length; i++) {
            rnd = new Random().nextInt(i,nums.length);
            tmp = shuffled[i];
            shuffled[i] = shuffled[rnd];
            shuffled[rnd] = tmp;
        }
        return shuffled;
    }

    public static String toString(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += "" + arr[i];
            } else {
                s += arr[i] + ", ";
            }
        }
        return "{" + s + "}";
    }
}
