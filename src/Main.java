import java.util.Arrays;

import dip.leetcode.solutions.Solution155;

public class Main {

    public static void main(String[] args) {
        Solution155 stack = new Solution155();
        System.out.println("push 10");
        stack.push(10);
        System.out.println("min: " + stack.getMin());
        System.out.println("top: " + stack.top());

        System.out.println("push 20");
        stack.push(20);
        System.out.println("min: " + stack.getMin());
        System.out.println("top: " + stack.top());

        System.out.println("push 7");
        stack.push(7);
        System.out.println("min: " + stack.getMin());
        System.out.println("top: " + stack.top());

        System.out.println();
        System.out.println("push 5");
        stack.push(5);
        System.out.println("min: " + stack.getMin());
        System.out.println("top: " + stack.top());
        System.out.println();
        stack.pop();
        System.out.println("pop");
        System.out.println("min: " + stack.getMin());
        System.out.println("top: " + stack.top());
    }

}