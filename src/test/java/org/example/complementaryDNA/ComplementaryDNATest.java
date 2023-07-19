package org.example.complementaryDNA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryDNATest {
    @ParameterizedTest
    @CsvSource({
            "TTTT, AAAA",
            "TAACG, ATTGC",
            "CATA, GTAT",
            "A, T",
            "T, A"
    })
    void makeComplement(String input, String expected) {
        ComplementaryDNA complementaryDNA = new ComplementaryDNA();
        String actualValue = complementaryDNA.makeComplement(input);

        assertEquals(expected, actualValue);
    }
}