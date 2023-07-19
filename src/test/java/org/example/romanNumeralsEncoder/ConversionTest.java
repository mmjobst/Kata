package org.example.romanNumeralsEncoder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @ParameterizedTest
    @CsvSource({
            "1, I",
            "4, IV",
            "6, VI",
            "10, X",
            "1000, M",
            "1990, MCMXC",
            "2008, MMVIII",
            "1666, MDCLXVI"
    })
    void convert(int input, String expected) {
        Conversion conversion = new Conversion();
        String actualValue = conversion.intToRoman(input);

        assertEquals(expected, actualValue);
    }
}