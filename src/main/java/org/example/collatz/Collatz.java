package org.example.collatz;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

    public String generateCollatz(int n) {
        List<String> sequence = new ArrayList<>();
        sequence.add(Integer.toString(n));

        while (n > 1) {
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
            sequence.add(Integer.toString(n));
        }

        return String.join("->", sequence);
    }

}
