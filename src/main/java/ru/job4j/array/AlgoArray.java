package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        boolean changeFlag = true;
        while (changeFlag) {
            changeFlag = false;
            for (int i = 0; i < array.length - 1; i++) {
                int j = i + 1;
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    changeFlag = true;
                }
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
