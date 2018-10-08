package chapter4;

public class Coins {

    /**
     * @param arr 钱币种数（每张钱币有任意张）
     * @param aim 要找的钱数
     * @return 最少的张数 -1:找不开
     */
    public static int minCoins(int arr[], int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }
        int n = arr.length;//钱币种数
        int max = Integer.MAX_VALUE;//找不开的位置全部设为最大值
        //dp[i][j] 表示可以使用arr[0...i]货币的情况下，组成j所需的最小张数
        int dp[][] = new int[n][aim + 1];
        //求出只使用第一种钱币，最少要找的钱的张数
        for (int j = 1; j <= aim; j++) {
            dp[0][j] = max;
            if (j - arr[0] >= 0 && dp[0][j - arr[0]] != max) {
                dp[0][j] = dp[0][j - arr[0]] + 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                int left = max;
                if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
                    left = dp[i][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }

        return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
    }

    public static int minCoins2(int arr[], int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }

        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int dp[] = new int[aim + 1];

        for (int j = 1; j <= aim; j++) {
            dp[j] = max;
            if (j - arr[0] >= 0 && dp[j - arr[0]] != max) {
                dp[j] = dp[j - arr[0]] + 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                int left = max;
                if (j - arr[i] >= 0 && dp[j - arr[i]] != max) {
                    left = dp[j - arr[i]] + 1;
                }
                dp[j] = Math.min(left, dp[j]);
            }
        }

        return dp[aim] != max ? dp[aim] : -1;
    }

    public static int minCoins3(int arr[], int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }

        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int dp[][] = new int[n][aim + 1];

        for (int j = 1; j <= aim; j++) {
            dp[0][j] = max;
        }
        if (arr[0] <= aim) {
            dp[0][arr[0]] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                int leftup = max;
                if (j - arr[i] >= 0 && dp[i - 1][j - arr[i]] != max) {
                    leftup = dp[i - 1][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(leftup, dp[i - 1][j]);
            }
        }

        return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
    }

    public static int minCoins4(int arr[], int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }

        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int dp[] = new int[aim + 1];

        for (int j = 1; j <= aim; j++) {
            dp[j] = max;
        }
        if (arr[0] <= aim) {
            dp[arr[0]] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                int leftup = max;
                if (j - arr[i] >= 0 && dp[j - arr[i]] != max) {
                    leftup = dp[j - arr[i]] + 1;
                }
                dp[j] = Math.min(leftup, dp[j]);
            }
        }

        return dp[aim] != max ? dp[aim] : -1;
    }
}
