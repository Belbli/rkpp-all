package com.github.belbli.laba1.task1;

import com.github.belbli.utils.ArrayUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AlgorithmTest {
    public static final int[] ARRAY_WITH_ZERO_ENTRIES = {132, 33, 544, 1342, 432, 8752, 6532, 545, 76, 32};
    public static final int[] ARRAY_WITH_FIVE_ENTRIES = {222, 32, 544, 2342, 422, 8752, 6522, 545, 76, 22};

    Algorithm algorithm;
    ArrayUtils arrayUtils = new ArrayUtils();

    @BeforeClass
    private void setUp() {
        algorithm = new Algorithm(arrayUtils);
    }

    @Test
    public void testGetElementIndexesContainsLastDigitOfFirstItemTwice() {
        List<Integer> result = algorithm.getElementIndexesContainsLastDigitOfFirstItemTwice(ARRAY_WITH_FIVE_ENTRIES);

        assertEquals(result.size(), 5);
        assertEquals(result.get(0), Integer.valueOf(0));
        assertEquals(result.get(1), Integer.valueOf(3));
        assertEquals(result.get(2), Integer.valueOf(4));
        assertEquals(result.get(3), Integer.valueOf(6));
        assertEquals(result.get(4), Integer.valueOf(9));
    }

    @Test
    public void testGetElementIndexesContainsLastDigitOfFirstItemTwiceWhenZeroFound() {
        List<Integer> result = algorithm.getElementIndexesContainsLastDigitOfFirstItemTwice(ARRAY_WITH_ZERO_ENTRIES);

        assertTrue(result.isEmpty());
    }
}