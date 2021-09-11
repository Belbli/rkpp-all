package com.github.belbli.laba1.task2;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlgorithmFor2DArrayTest {
    private static final int[][] input =
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
    private static final int[] expectedOutput = {1, 3, 5, 7, 9};
    private final AlgorithmFor2DArray algorithm = new AlgorithmFor2DArray();

    @Test
    public void convertToOneDimensionalArray() {
        int[] result = algorithm.convertToOneDimensionalArray(input);

        assertEquals(result, expectedOutput);
    }

}