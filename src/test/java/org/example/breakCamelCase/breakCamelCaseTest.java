package org.example.breakCamelCase;

import org.example.collatz.Collatz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class breakCamelCaseTest {
    @ParameterizedTest
    @CsvSource({
            "camelCasing, camel Casing",
            "camelCasingTest, camel Casing Test",
            "camelcasingtest, camelcasingtest",
    })

    public void camelCaseTest(String input, String expected){
        CamelCase camelCase = new CamelCase();
        String actual = camelCase.breakCamelCase(input);

        assertEquals(expected, actual);

    }

}