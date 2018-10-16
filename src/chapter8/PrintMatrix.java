package chapter8;

import java.util.ArrayList;

/**
 * 转圈打印矩阵
 */
public class PrintMatrix {

    public static void spiralOrderPrint(int matrix[][]) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static ArrayList<Integer> getSpiralOrderPrintArray(int matrix[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC) {
            printEdge(res, matrix, tR++, tC++, dR--, dC--);
        }
        return res;
    }

    //左上角端点T(tR,tC) 右下角端点D(dR,dC)
    public static void printEdge(int m[][], int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            //只有一行
            for (int i = tC; i <= dC; i++) {
                System.out.print(m[tR][i]);
            }
            System.out.println();
        } else if (tC == dC) {
            //只有一列
            for (int i = tR; i <= dR; i++) {
                System.out.print(m[i][tC]);
            }
            System.out.println();
        } else {
            int curR = tR;
            int curC = tC;
            while (curC != dC) {
                System.out.print(m[tR][curC] + " ");
                curC++;
            }
            while (curR != dR) {
                System.out.print(m[curR][dC] + " ");
                curR++;
            }
            while (curC != tC) {
                System.out.print(m[dR][curC] + " ");
                curC--;
            }
            while (curR != tR) {
                System.out.print(m[curR][tC] + " ");
                curR--;
            }
        }
    }

    //左上角端点T(tR,tC) 右下角端点D(dR,dC)
    public static void printEdge(ArrayList<Integer> res, int m[][], int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            //只有一行
            for (int i = tC; i <= dC; i++) {
                res.add(m[tR][i]);
            }
        } else if (tC == dC) {
            //只有一列
            for (int i = tR; i <= dR; i++) {
                res.add(m[i][tC]);
            }
        } else {
            int curR = tR;
            int curC = tC;
            while (curC != dC) {
                res.add(m[tR][curC]);
                curC++;
            }
            while (curR != dR) {
                res.add(m[curR][dC]);
                curR++;
            }
            while (curC != tC) {
                res.add(m[dR][curC]);
                curC--;
            }
            while (curR != tR) {
                res.add(m[curR][tC]);
                curR--;
            }
        }
    }
}
