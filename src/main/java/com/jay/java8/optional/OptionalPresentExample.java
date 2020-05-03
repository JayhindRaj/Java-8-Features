package com.jay.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello Optional");

        // isPresent
        System.out.println("isPresent: " + optional.isPresent());
        if (optional.isPresent()) {
            System.out.println("Value: " + optional.get());
        }

        // ifPresent
        optional.ifPresent(System.out::println);
    }
}
