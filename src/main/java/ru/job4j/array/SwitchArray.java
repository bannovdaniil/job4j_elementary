package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int j = array.length - 1;
        int tmp = array[0];
        array[0] = array[j];
        array[j] = tmp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
