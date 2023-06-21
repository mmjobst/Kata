package org.example.getMiddleChar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class GetMiddleCharTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void getMiddleCharTest(String word, String expected){
        GetMiddleChar middleChar = new GetMiddleChar();
        String actual = middleChar.getMiddle(word);
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> testCases(){
        return Stream.of(
                Arguments.of("hallo", "l"),
                Arguments.of("test", "es"),
                Arguments.of("testing", "t"),
                Arguments.of("A", "A"),
                Arguments.of("", null)
        );
    }
}
