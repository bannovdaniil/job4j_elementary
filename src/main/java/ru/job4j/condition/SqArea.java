package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double length = h * k;

        double rsl = length * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

        System.out.println(SqArea.square(7, 4));

        System.out.println(SqArea.square(5, 10));
    }

}
