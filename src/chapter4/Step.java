package chapter4;

import utils.MatrixUtil;

/**
 * 台阶问题 S(n)=S(n-1)+s(n-2) s(1)=1 s(2)=2
 */
public class Step {
    public static int s1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }

        return s1(n - 1) + s1(n - 2);
    }

    public static int s2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }

        int res = 2;
        int pre = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = res;
            res = res + pre;
            pre = tmp;
        }

        return res;
    }

    public static int s3(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }

        int base[][] = {{1, 1}, {1, 0}};
        int res[][] = MatrixUtil.matrixPower(base, n - 2);

        return res[0][0] + res[1][0];
    }
}
