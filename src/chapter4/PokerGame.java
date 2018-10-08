package chapter4;

/**
 * 排成一条线的纸牌博弈问题
 */
public class PokerGame {

    public static int win2(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int f[][] = new int[arr.length][arr.length];
        int s[][] = new int[arr.length][arr.length];

        for (int j = 0; j < arr.length; j++) {
            f[j][j] = arr[j];
            for (int i = j - 1; i >= 0; i--) {
                f[i][j] = Math.max(arr[i] + s[i + 1][j], arr[j] + s[i][j - 1]);
                s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);
            }
        }

        return Math.max(f[0][arr.length - 1], s[0][arr.length - 1]);
    }

    public static int win1(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return Math.max(f(arr, 0, arr.length - 1), s(arr, 0, arr.length - 1));
    }

    /**
     * f(i,j):在arr[i...j]这个排列上被绝顶聪明的人先拿会得到的分数
     *
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static int f(int arr[], int i, int j) {
        //只剩一张牌,先拿可以获得的最大分数
        if (i == j) {
            return arr[j];
        }

        //拿arr[i] + s(i+1,j)(在剩下的牌中后拿可以获得的最大分数)
        //拿arr[j] + s(i,j-1)(在剩下的牌中后拿可以获得的最大分数)
        return Math.max(arr[i] + s(arr, i + 1, j), arr[j] + s(arr, i, j - 1));
    }

    /**
     * s(i,j):在arr[i...j]这个排列上被绝顶聪明的人后拿会得到的分数
     *
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static int s(int arr[], int i, int j) {
        //只剩一张牌,后拿可以获得的最大分数
        if (i == j) {
            return 0;
        }

        //对方也是绝顶聪明,对方会拿arr[i]或arr[j]
        //f(i+1,j) 对方拿arr[i]自己可以获得的最大分数
        //f(i,j-1) 对方拿arr[j]自己可以获得的最大分数
        return Math.min(f(arr, i + 1, j), f(arr, i, j - 1));
    }
}
