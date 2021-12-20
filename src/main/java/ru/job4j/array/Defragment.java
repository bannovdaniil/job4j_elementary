package ru.job4j.array;

public class Defragment {
    private static String[] swapArray(String[] array, int source, int dest) {
        String tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int iNot = index + 1; iNot < array.length; iNot++) {
                    if (array[iNot] != null) {
                        swapArray(array, index, iNot);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
