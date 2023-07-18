package org.example.scramplies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ScrampliesTest {

    @ParameterizedTest
    @CsvSource({
            "rkqodlw,world,true",
            "cedewaraaossoqqyt,codewars,true",
            "katas,steak,false",
            "scriptjavx,javascript,false",
            "scriptingjava,javascript,true",
            "scriptsjava,javascripts,true",
            "javscripts,javascript,false",
            "aabbcamaomsccdd,commas,true",
            "commas,commas,true",
            "sammoc,commas,true",
            "javac, java, true"


    })
    public void scrambleTest(String input, String output, boolean expected){
        Scramplies scramplies = new Scramplies();
        boolean actual = scramplies.scrample(input, output);
        assertEquals(expected, actual);
    }

}