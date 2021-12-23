package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int x1, int x2, int x3) {
        return max(max(x1, x2), x3);
    }

    public static int max(int x1, int x2, int x3, int x4) {
        return max(max(x1, x2), max(x3, x4));
    }
}
