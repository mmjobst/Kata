package org.example.simplePigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public String pigIt(String str){
        return Arrays.stream(str.split(" "))
                .map(this::transformWord)
                .collect(Collectors.joining(" "));
    }

    private String transformWord(String word) {
        if (word.matches("[a-zA-Z]+")) {
            return word.substring(1) + word.charAt(0) + "ay";
        }
        return word;
    }
}
