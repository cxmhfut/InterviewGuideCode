package chapter9;

/**
 * 一行代码求两个数的最大公约数
 */
public class Gcd {

    //m=nq+r m和n的最大公约数=n和r的最大公约数
    public static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }

}
