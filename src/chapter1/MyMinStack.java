package chapter1;

public interface MyMinStack {
    /**
     * push
     * @param newNum
     */
    void push(int newNum);

    /**
     * pop
     * @return
     */
    int pop();

    /**
     * getMin
     * @return
     */
    int getMin();
}
