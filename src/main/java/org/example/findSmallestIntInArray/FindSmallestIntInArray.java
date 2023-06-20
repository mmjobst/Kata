package org.example.findSmallestIntInArray;

import java.util.Arrays;

public class FindSmallestIntInArray {
    public int findSmallestInt(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .getAsInt();
    }
}
