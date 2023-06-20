package org.example.findSmallestIntInArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindSmallestIntInArrayTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void findSmallestIntTest(int[] arr, int expected){
        FindSmallestIntInArray finder = new FindSmallestIntInArray();
        int actual = finder.findSmallestInt(arr);
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> testCases(){
        return Stream.of(
                Arguments.of(new int[]{34, 15, 88, 2}, 2),
                Arguments.of(new int[]{34, -345, -1, 100}, -345),
                Arguments.of(new int[]{0, 0, 0, 0}, 0),
                Arguments.of(new int[]{-10, -20, -30, -40}, -40),
                Arguments.of(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}, -Integer.MIN_VALUE)
        );
    }
}
