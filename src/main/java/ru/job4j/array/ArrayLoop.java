package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] iArray = new int[5];

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = i * 2 + 3;
        }

        for (int i: iArray) {
            System.out.println(i);
        }
    }
}
