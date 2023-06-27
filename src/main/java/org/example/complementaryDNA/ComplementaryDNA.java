package org.example.complementaryDNA;

import java.util.*;
import java.util.stream.Collectors;

public class ComplementaryDNA {

    private final Map<Character, Character> COMPLEMENT_MAP = Map.of(
            'A', 'T',
            'T', 'A',
            'C', 'G',
            'G', 'C'
    );

    public String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(letter -> COMPLEMENT_MAP.get((char) letter))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
