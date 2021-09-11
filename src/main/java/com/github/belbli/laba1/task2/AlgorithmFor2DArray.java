package com.github.belbli.laba1.task2;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmFor2DArray {
    public int[] convertToOneDimensionalArray(int[][] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    result.add(array[i][j]);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
