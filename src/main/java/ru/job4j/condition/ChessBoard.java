package ru.job4j.condition;

public class ChessBoard {
    public static boolean check0to7(int num) {
        if (num >= 0 && num <= 7) {
            return true;
        }
        return false;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        if (check0to7(x1) && check0to7(x2) && check0to7(y1) && check0to7(y2)) {

            int deltaX = Math.abs(x2 - x1);

            if (deltaX == Math.abs(y2 - y1)) {
                return deltaX;
            }
        }
        return 0;
    }
}
