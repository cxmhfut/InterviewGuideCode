package chapter4;

/**
 * 跳跃游戏
 */
public class JumpGame {

    public static int jump(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int jump = 0;//目前跳了多少步
        int cur = 0;//如果只跳jump步最远能到达的位置
        int next = 0;//若果再多跳一步可以到达的位置

        for (int i = 0; i < arr.length; i++) {
            if (cur < i) {
                jump++;
                cur = next;
            }
            next = Math.max(next, i + arr[i]);
        }

        return jump;
    }
}
