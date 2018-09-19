package chapter1;

import java.util.Stack;

/**
 * 设计一个有GetMin功能的栈
 */
public class MyStack2 implements MyMinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }


    @Override
    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
            stackData.push(newNum);
            return;
        }

        stackData.push(newNum);
        int min = stackMin.peek();
        min = min < newNum ? min : newNum;
        stackMin.push(min);
    }

    @Override
    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your Stack is Empty.");
        }

        stackMin.pop();
        return stackData.pop();
    }

    @Override
    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is Empty.");
        }

        return stackMin.peek();
    }
}
