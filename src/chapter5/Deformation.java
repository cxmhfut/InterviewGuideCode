package chapter5;

public class Deformation {
    public static boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        int a[] = new int[256];

        for (char c : ch1) {
            a[c]++;
        }

        for (char c : ch2) {
            if (a[c]-- == 0) {
                return false;
            }
        }

        return true;
    }
}
