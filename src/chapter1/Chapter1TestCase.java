package chapter1;

import org.junit.Test;

public class Chapter1TestCase {

    @Test
    public void testMinStack2(){
        MyStack2 stack = new MyStack2();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }

    @Test
    public void testMinStack1() {
        MyStack1 stack = new MyStack1();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}
