package org.example.kata01;

import java.util.Arrays;

public class KataOne {
    public static int findSmallestInt(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .getAsInt();
    }
}
