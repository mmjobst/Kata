package org.example.breakCamelCase;

import java.util.stream.Collectors;

public class CamelCase {
    public String breakCamelCase(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.isUpperCase(c) ? " " + c : String.valueOf(c))
                .collect(Collectors.joining());
    }
}
