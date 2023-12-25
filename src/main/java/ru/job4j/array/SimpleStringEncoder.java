package ru.job4j.array;

/**
 * В данной задаче Вам необходимо будет реализовать элементарный алгоритм сжатия строки на основе счетчика повторяющихся символов.
 * <p>
 * При реализации мы будем использовать следующие упрощения и особенности:
 * <p>
 * - строка не может быть пустой;
 * - строка состоит только из строчных символов;
 * - группы одинаковых символов могут повторяться (из aaabbaa мы должны получить a3b2a2);
 * - учитывайте, что одинаковых символов подряд может быть больше 9 и тогда число повторений будет двузначным;
 */
public class SimpleStringEncoder {
    public static void main(String[] args) {
        String first = "aaabvddrr";
        System.out.println(encode(first));
    }

    /**
     * StringBuilder возможно был бы эфективнее, хотя concat в версиях java старше 15, была переписана и стала также достаточно быстрой операцией.
     * @param input - входные данные
     * @return - закодированная строка
     */
    public static String encode(String input) {
        String result = "";
        int counter = 1;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (counter == 1) {
                result = result.concat(String.valueOf(symbol));
            }
            if (i != input.length() - 1 && symbol == input.charAt(i + 1)) {
                counter++;
            } else if (counter > 1) {
                result = result.concat(String.valueOf(counter));
                counter = 1;
            }
        }

        return result;
    }
}
