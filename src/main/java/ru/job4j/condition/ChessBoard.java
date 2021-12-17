package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int deltaX = Math.abs(x2) - Math.abs(x1);
        int deltaY = Math.abs(y2) - Math.abs(y1);
        int rsl = 0;

        if ((deltaX < 0 && deltaY > 0) || (deltaX > 0 && deltaY > 0) || (deltaX < 0 && deltaY < 0) || (deltaX > 0 && deltaY < 0)) {
            deltaX = Math.abs(deltaX);
            deltaY = Math.abs(deltaY);

            if (deltaX == deltaY) {
                rsl = deltaX;
            }
        }
        return rsl;
    }
}
