package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int right = array.length - 1;
        int left = 0;
        for (int i : array) {
            array[left++] = array[right];
            array[right--] = i;
            if (left >= right) {
                break;
            }
        }
        return array;
    }
}
