package com.github.belbli.utils;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayUtils {
    private static Random random = new Random();

    public int[] createRandomArray(int length, int digits) {
        assert length > 0 && digits > 0;

        int bound = (int) Math.pow(10, digits) + 1;
        return IntStream.range(0, length)
                .map(i -> random.nextInt(bound))
                .toArray();
    }

    public boolean strContainsChar(String str, char searchedChar, int entries) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == searchedChar) {
                count++;
                if (count == entries) {
                    return true;
                }
            }
        }
        return false;
    }
}
