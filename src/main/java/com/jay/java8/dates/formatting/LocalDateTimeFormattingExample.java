package com.jay.java8.dates.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormattingExample {
    public static void formattingLocalDate() {
        System.out.println(" **************** LocalDate Formatting ****************");
        LocalDate localDate = LocalDate.now();
        String localDate1 = localDate.format(DateTimeFormatter.ofPattern("yyyy*MM|dd"));
        System.out.println("localDate1 : " + localDate1);
    }

    public static void formattingLocalTime() {
        System.out.println(" **************** LocalTime Formatting ****************");
        LocalTime localTime = LocalTime.now();
        String localTime1 = localTime.format(DateTimeFormatter.ofPattern("HH*mm|ss"));
        System.out.println("localTime1 : " + localTime1);
    }

    public static void formattingLocalDateTime() {
        System.out.println(" **************** LocalDateTime Formatting ****************");
        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTime1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy*MM|dd'ABC'HH.mm*ss"));
        System.out.println("localDateTime1: " + localDateTime1);
    }

    public static void main(String[] args) {
        formattingLocalDate();
        formattingLocalTime();
        formattingLocalDateTime();
    }
}
