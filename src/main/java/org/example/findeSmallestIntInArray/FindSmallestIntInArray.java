package org.example.findeSmallestIntInArray;

import java.util.Arrays;

public class FindSmallestIntInArray {
    public static int findSmallestInt(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .getAsInt();
    }
}
