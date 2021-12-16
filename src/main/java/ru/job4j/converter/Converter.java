package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        float out = Converter.rubleToEuro(in);
        float expected = 2;
        boolean test1 = expected == out;
        System.out.println(in + " rubles are " + out + " euro. Test result:" + test1);

        in = 120;
        out = Converter.rubleToDollar(in);
        boolean test2 = expected == out;
        System.out.println(in + " rubles are " + out + " dollar. Test result:" + test2);
    }
}
