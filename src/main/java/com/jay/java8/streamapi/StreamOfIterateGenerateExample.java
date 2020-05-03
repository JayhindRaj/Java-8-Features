package com.jay.java8.streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String> days = Stream.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println("Days: ");
        days.forEach(System.out::println);
        Stream.iterate(1, x -> x * 2).limit(12).forEach(System.out::println);
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
    }
}
