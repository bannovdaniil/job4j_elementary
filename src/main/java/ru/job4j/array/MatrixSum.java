package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                sum += array[x][y];
            }
        }
        return sum;
    }
}
