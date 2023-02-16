package dip.leetcode.solutions;

import java.util.Stack;

public class Solution155 {
  MinStack min_stack;

  public Solution155() {
    min_stack = new MinStack();
  }

  public void push(int val) {
    min_stack.push(val);
  }

  public void pop() {
    min_stack.pop();
  }

  public int top() {
    return min_stack.top();
  }

  public int getMin() {
    return min_stack.getMin();
  }

  class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int val) {
      stack.push(min);
      stack.push(val);
      min = Math.min(val, min);
    }

    public void pop() {
      if (!stack.isEmpty()) {
        stack.pop();
        min = stack.pop();
      }
    }

    public int top() {
      return stack.peek();
    }

    public int getMin() {
      return min;
    }
  }

  /**
   * Your MinStack object will be instantiated and called as such:
   * MinStack obj = new MinStack();
   * obj.push(val);
   * obj.pop();
   * int param_3 = obj.top();
   * int param_4 = obj.getMin();
   */
}