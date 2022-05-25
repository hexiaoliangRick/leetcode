package main;

public class VersionControl {
    public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int half = (end - start) / 2 + start;
            boolean result = isBadVersion(half);
            //找到最早坏的那一个版本
            if (result) {
                end = half;
            } else {
                start = half + 1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int version) {
        return version >= 999;
    }

    public static void main(String[] args) {
        int value = firstBadVersion(100000);
        System.out.println(value);
    }
}
