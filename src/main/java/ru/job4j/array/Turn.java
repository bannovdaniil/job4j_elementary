package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int right = array.length - 1;
        for (int left = 0; left < right; left++) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            right--;
        }
        return array;
    }
}
