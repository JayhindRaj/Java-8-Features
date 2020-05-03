package com.jay.java8.defaults;

import java.util.List;

public interface Multiplier {
    static boolean isEmpty(List<Integer> integerList) {
        return integerList == null || integerList.size() == 0;
    }

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList) {
        System.out.println("From Multiplier Interface");
        return integerList.size();
    }

    default void print(List<Integer> integerList) {
        System.out.println("Print From Multiplier Interface");
        integerList.forEach(System.out::println);
    }
}
