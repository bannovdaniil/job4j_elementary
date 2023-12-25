package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleStringEncoderTest {
    @DisplayName("String Encoder")
    @ParameterizedTest
    @CsvSource(value = {
            "a; a",
            "aa; a2",
            "aaabbc; a3b2c",
            "abbccc; ab2c3",
            "aaabcc; a3bc2",
            "abc; abc",
            "aaabbbccc; a3b3c3",
            "aaaaaaaaaaaabbbcdddd; a12b3cd4",
            "aaabbbbaaabbcccddddd; a3b4a3b2c3d5"
    }, delimiter = ';')
    void whenOnlyOne(String input, String expected) {
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }
}
