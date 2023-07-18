package org.example.scramplies;

import java.util.HashMap;
import java.util.Map;

public class Scramplies {
    public boolean scrample(String str1, String str2) {
        Map<Character, Integer> charCounts = new HashMap<>();


        for (char c : str1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }


        for (char c : str2.toCharArray()) {
            int count = charCounts.getOrDefault(c, 0);
            if (count <= 0) {
                return false;
            }
            charCounts.put(c, count - 1);
        }

        return true;
    }
}
