package chapter4;

import utils.MatrixUtil;

/**
 * 斐波那契数列 F(n)=F(n-1)+F(n-2) F(1)=1 F(2)=1
 */
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

    public int fib3(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int base[][] = {{1, 1}, {1, 0}};
        int res[][] = MatrixUtil.matrixPower(base, n - 2);

        return 2 * res[0][0] + res[1][0];
    }
}
