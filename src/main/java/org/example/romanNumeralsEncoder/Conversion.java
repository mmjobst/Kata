package org.example.romanNumeralsEncoder;

import java.util.LinkedHashMap;
import java.util.Map;

public class Conversion {

    private static Map<Integer, String> getNumeralMap() {
        Map<Integer, String> numerals = new LinkedHashMap<>();
        numerals.put(1000, "M");
        numerals.put(900, "CM");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100, "C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");
        return numerals;
    }

    public String intToRoman(int number){
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999.");
        }

        Map<Integer, String> numerals = getNumeralMap();

        StringBuilder romanNumeral = new StringBuilder();

        for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
            int value = entry.getKey();
            String numeral = entry.getValue();

            while (number >= value) {
                romanNumeral.append(numeral);
                number -= value;
            }
        }

        return romanNumeral.toString();
    }
}
