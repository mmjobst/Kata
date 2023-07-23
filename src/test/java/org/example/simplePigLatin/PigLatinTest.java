package org.example.simplePigLatin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    @ParameterizedTest
    @CsvSource({
            "Pig latin is cool, igPay atinlay siay oolcay ",
            "Hello world !, elloHay orldway !"})

    public void collatzTest(String input, String expected){
        PigLatin pigLatin = new PigLatin();
        String actual = pigLatin.pigIt(input);
        assertEquals(expected, actual);

    }

}