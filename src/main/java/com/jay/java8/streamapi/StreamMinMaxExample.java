package com.jay.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 8, 9, 13, 23, 12, 7);
        findMinMax(integerList);
        findMinMaxAsOptional(integerList);
        findMinMaxAsOptional(new ArrayList<>());
    }

    private static void findMinMax(List<Integer> integerList) {
        int max = integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);

        int min = integerList.stream()
                .reduce(0, (x, y) -> x < y ? x : y);

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }

    private static void findMinMaxAsOptional(List<Integer> integerList) {
        Optional<Integer> max = integerList.stream()
                .reduce((x, y) -> x > y ? x : y);

        Optional<Integer> min = integerList.stream()
                .reduce((x, y) -> x < y ? x : y);

        if (max.isPresent()) {
            System.out.println("Max " + max.get());
        } else {
            System.out.println("No Max Value");
        }
        if (min.isPresent()) {
            System.out.println("Min " + min.get());
        } else {
            System.out.println("No Min Value");
        }
    }
}
