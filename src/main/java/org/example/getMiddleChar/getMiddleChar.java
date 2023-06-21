package org.example.getMiddleChar;

public class GetMiddleChar {
    public String getMiddle(String word) {
        int length = word.length();
        int middleIndex = length / 2;

        if (length == 0 ) {
            return null;
        } else if (length % 2 == 0) {
            return word.charAt(middleIndex - 1) + String.valueOf(word.charAt(middleIndex));
        } else {
            return String.valueOf(word.charAt(middleIndex));
        }
    }
}
