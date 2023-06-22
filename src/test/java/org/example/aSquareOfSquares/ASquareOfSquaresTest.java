package org.example.aSquareOfSquares;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ASquareOfSquaresTest {

    @ParameterizedTest
    @CsvSource({
            "-1,false",
            "0,true",
            "3, false",
            "4, true",
            "16, true",
            "25, true",
            "26, false"
    })
    public void squareOfSquaresTest(int input, boolean expected) {
        ASquareOfSquares squareOfSquares = new ASquareOfSquares();
        boolean actualValue = squareOfSquares.isSquare(input);
        assertEquals(expected, actualValue);
    }
}
