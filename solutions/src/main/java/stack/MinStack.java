package stack;

import java.util.Stack;

public class MinStack
{
    private int min;
    private Stack<Integer> stack;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack();
    }

    public void push(int x) {
        if (x <= min)
        {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        Integer top = stack.pop();
        if (top == min)
        {
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
