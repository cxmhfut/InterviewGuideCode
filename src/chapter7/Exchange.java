package chapter7;

import java.util.Arrays;

/**
 * 不用额外的变量交换两个数
 */
public class Exchange {
    public static void main(String[] args) {
        int a = 1, b = 0;
        int arr[] = {a, b};
        exchange1(arr);
        System.out.println(Arrays.toString(arr));
        exchange2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void exchange1(int arr[]) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }

    public static void exchange2(int arr[]) {
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }
}
