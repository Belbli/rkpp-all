package com.github.belbli.laba1.task1;

import com.github.belbli.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    private ArrayUtils arrayUtils;

    public Algorithm(ArrayUtils arrayUtils) {
        this.arrayUtils = arrayUtils;
    }

    public List<Integer> getElementIndexesContainsLastDigitOfFirstItemTwice(int[] array) {
        List<Integer> result = new ArrayList<>();
        String firstNumber = String.valueOf(array[0]);
        char lastDigitOfTheFirstElement = firstNumber.charAt(firstNumber.length() - 1);

        for (int i = 0; i < array.length; i++) {
            if (arrayUtils.strContainsChar(String.valueOf(array[i]), lastDigitOfTheFirstElement, 2)) {
                result.add(i);
            }
        }
        return result;
    }
}
