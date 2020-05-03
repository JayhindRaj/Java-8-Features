package com.jay.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream().limit(5).reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream().skip(3).reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 8, 9, 13, 23, 12, 7);

        Optional<Integer> limit = limit(integerList);
        System.out.println("limit " + limit);
        if (limit.isPresent()) {
            System.out.println("limit " + limit.get());
        } else {
            System.out.println("No Value");
        }

        Optional<Integer> skipValue = skip(integerList);
        System.out.println("Skip " + skipValue);
        if (skipValue.isPresent()) {
            System.out.println("Skip " + skipValue.get());
        } else {
            System.out.println("No Value");
        }
    }
}
