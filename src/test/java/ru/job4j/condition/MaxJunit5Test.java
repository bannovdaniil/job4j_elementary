package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxJunit5Test {

    @Test
    public void whenMax1To2To3Then3() {
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int result = Max.max(x1, x2, x3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To1Then3() {
        int x1 = 2;
        int x2 = 3;
        int x3 = 1;
        int result = Max.max(x1, x2, x3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To3To4To5Then5() {
        int x1 = 1;
        int x2 = 3;
        int x3 = 4;
        int x4 = 5;
        int result = Max.max(x1, x2, x3, x4);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}