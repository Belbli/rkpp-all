package com.github.belbli.laba7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfPolynomials {
    public static void main(String[] args) throws IOException {
        //laba 7
        Map<Integer, Integer> firstPolynomial = new HashMap<>();
        Map<Integer, Integer> secondPolynomial = new HashMap<>();

        firstPolynomial.put(0, 1);
        firstPolynomial.put(1, 3);
        firstPolynomial.put(2, 4);
        firstPolynomial.put(3, 12);

        secondPolynomial.put(0, 3);
        secondPolynomial.put(1, 7);
        secondPolynomial.put(2, 1);

        Map<Integer, Integer> sum = new HashMap<>(firstPolynomial);
        secondPolynomial.forEach((k, v) -> sum.merge(k, v, (v1, v2) -> v1 + v2));

        //laba 8
        new FileOutputStream("sum.txt").write(
                ("sum of polynomials is equal to: "
                        + sum.entrySet()
                        .stream()
                        .map(entry -> "" + entry.getValue() + "^" + entry.getKey())
                        .collect(Collectors.joining("+"))).getBytes(StandardCharsets.UTF_8)
        );
    }
}
