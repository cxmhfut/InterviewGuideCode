package chapter4;

public class Fibonacci {

    public int fib1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib1(n - 1) + fib1(n - 2);
    }

    public int fib2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int res = 1;
        int pre = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = res;
            res = res + pre;
            pre = tmp;
        }

        return res;
    }
}
