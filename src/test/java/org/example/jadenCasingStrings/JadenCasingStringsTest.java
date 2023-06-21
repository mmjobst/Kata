package org.example.jadenCasingStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class JadenCasingStringsTest {

    @ParameterizedTest
    @CsvSource({
            "most trees are blue, Most Trees Are Blue",
            "How can mirrors be real if our eyes aren't real,How Can Mirrors Be Real If Our Eyes Aren't Real"
    })
    public void toJadenCaseTest(String input, String expected){
        JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();

        String actualValue = jadenCasingStrings.toJadenCase(input);
        assertEquals(expected, actualValue);

    }

    @ParameterizedTest
    @CsvSource({
            " ,null",
            "'', ''"
    })
    public void toJadenCaseTestEmptyString(String input, String expected) {
        JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();

        String actualValue = jadenCasingStrings.toJadenCase(input);
        assertNull(actualValue);
    }

    @ParameterizedTest
    @NullSource
    public void toJadenCaseTestNull(String input) {
        JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();

        String actualValue = jadenCasingStrings.toJadenCase(input);
        assertNull(actualValue, "Expected null");
    }

}