package com.jay.java8.streamapi.terminal;

import com.jay.java8.predicate.StudentStore;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {
    public static void main(String[] args) {
        System.out.println("Count " + StudentStore.getStudents().stream().collect(counting()));
        System.out.println("Count " + StudentStore.getStudents().stream().filter(s -> s.getGender().equalsIgnoreCase("female")).collect(counting()));
    }
}
