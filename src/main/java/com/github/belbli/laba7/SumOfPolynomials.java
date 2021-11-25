package com.github.belbli.laba7;

import java.util.HashMap;
import java.util.Map;

public class SumOfPolynomials {
    public static void main(String[] args) {
        // 7laba
        Map<Integer, Integer> firstPolynomial = new HashMap<>();
        Map<Integer, Integer> secondPolynomial = new HashMap<>();

        Map<Integer, Integer> sum = new HashMap<>(firstPolynomial);
        secondPolynomial.forEach((k, v) -> sum.merge(k, v, (v1, v2) -> v1 + v2));

    }
}
