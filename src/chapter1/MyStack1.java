package chapter1;

import java.util.Stack;

/**
 * 设计一个有GetMin功能的栈
 */
public class MyStack1 implements MyMinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    @Override
    public void push(int newNum) {
        if (!stackMin.isEmpty()) {
            int min = stackMin.peek();
            if (newNum <= min) {
                stackMin.push(newNum);
            }
        } else {
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }

    @Override
    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your Stack is Empty.");
        }

        int value = stackData.pop();
        if (value == stackMin.peek()) {
            stackMin.pop();
        }

        return value;
    }

    @Override
    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your Stack is Empty.");
        }
        return stackMin.peek();
    }
}
