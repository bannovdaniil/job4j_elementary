package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(7, 8, 4, 4);
        System.out.println("result (7, 8) to (4, 4) " + result);

        result = Point.distance(10, 17, 2, 0);
        System.out.println("result (10, 17) to (2, 0) " + result);
    }
}
