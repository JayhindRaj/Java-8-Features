package com.jay.java8.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (x, y) -> x * y);
    }

    public void print(List<Integer> integerList) {
        System.out.println("Print From MultiplierImpl class");
        integerList.forEach(System.out::println);
    }
//    public int size(List<Integer> integerList) {
//        System.out.println("From MultiplierImpl class");
//        return integerList.size();
//    }
}
