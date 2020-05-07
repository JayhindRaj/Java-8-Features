package com.jay.java8.dates.duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(9, 20);

        long s = localTime1.until(localTime2, ChronoUnit.MINUTES);

        System.out.println("Minutes: " + s);
        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("toDays: " + duration.toDays());
        System.out.println("toNanos: " + duration.toNanos());
        System.out.println("getSeconds: " + duration.getSeconds());
        System.out.println("toMinutes: " + duration.toMinutes());
    }
}
