package com.jay.java8.dates.duration;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println("Instant: " + instant);
        // 1st JAN 1970 represents 0 sec
        System.out.println("getEpochSecond: " + instant.getEpochSecond());
        System.out.println("Date from epoch seconds: " + Instant.ofEpochSecond(0));
    }
}
