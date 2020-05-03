package com.jay.java8.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {

    public static void main(String[] args) {
        // Range
        IntStream.range(1, 10).forEach(System.out::println);

        // RangeClosed
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        // Sum
        int sum = IntStream.range(5, 35).sum();
        System.out.println("Sum is: " + sum);

        // Count
        System.out.println("Count is: " + LongStream.rangeClosed(12, 56).count());

        // Min
        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        System.out.println(max.isPresent() ? max.getAsInt() : 0);
        // Max
        OptionalInt min = IntStream.rangeClosed(1, 10).min();
        System.out.println(min.isPresent() ? min.getAsInt() : 0);
        // Average
        OptionalDouble avg = LongStream.rangeClosed(1, 50).average();
        System.out.println(avg.isPresent() ? avg.getAsDouble() : 0);

        // DoubleStream
        IntStream.rangeClosed(5, 25).asDoubleStream().forEach(System.out::println);
    }
}
