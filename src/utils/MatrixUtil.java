package utils;

public class MatrixUtil {
    /**
     * 计算矩阵相乘
     *
     * @param m1
     * @param m2
     * @return
     */
    public static int[][] muliMatrix(int[][] m1, int[][] m2) {
        if (m1[0].length != m2.length) {
            throw new RuntimeException("Matrix Shape Error.");
        }

        int res[][] = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return res;
    }

    /**
     * 求方阵的p次方
     *
     * @param m
     * @param p
     * @return
     */
    public static int[][] matrixPower(int[][] m, int p) {
        int res[][] = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            res[i][i] = 1;
        }

        int tmp[][] = m;
        for (; p != 0; p >>= 1) {
            if ((p & 1) != 0) {
                res = muliMatrix(res, tmp);
            }
            tmp = muliMatrix(tmp, tmp);
        }

        return res;
    }
}
