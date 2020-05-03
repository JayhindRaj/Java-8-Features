package com.jay.java8.dates;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void createLocalTime() {
        System.out.println("********************* LocalTime Creation *********************");
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);
        LocalTime localTime1 = LocalTime.of(22, 8, 2);
        System.out.println("LocalTime1 : " + localTime1);

        LocalTime localTime2 = LocalTime.of(22, 3, 47, 340);
        System.out.println("LocalTime2 : " + localTime2);
//        LocalTime localTime2 = LocalTime.of(2020, 04, 30);
//        System.out.println("LocalTime2 : " + localTime2);
//        LocalTime LocalTime3 = LocalTime.ofYearDay(2020, 124);
//        System.out.println("LocalTime3 : " + LocalTime3);
//        LocalTime LocalTime4 = LocalTime.ofEpochDay(6730678933L);
//        System.out.println("LocalTime4 : " + LocalTime4);
    }

//    public static void exploreLocalTimeProperties() {
//        System.out.println("********************* exploreDateProperties *********************");
//        LocalTime LocalTime = LocalTime.now();
//        System.out.println("LocalTime : " + LocalTime);
//        System.out.println("getDayOfMonth : " + LocalTime.getDayOfMonth());
//        System.out.println("getDayOfWeek : " + LocalTime.getDayOfWeek());
//        System.out.println("getDayOfYear : " + LocalTime.getDayOfYear());
//        System.out.println("MONTH_OF_YEAR : " + LocalTime.get(ChronoField.MONTH_OF_YEAR));
//        System.out.println("getMonthValue : " + LocalTime.getMonthValue());
//        System.out.println("getMonth : " + LocalTime.getMonth());
//        System.out.println("getEra : " + LocalTime.getEra());
//        System.out.println("getChronology : " + LocalTime.getChronology());
//        System.out.println("MONTH_OF_YEAR : " + LocalTime.getLong(ChronoField.MONTH_OF_YEAR));
//    }

//    public static void modifyingLocalTime() {
//        System.out.println("********************* Modification of LocalTime *********************");
//        LocalTime today = LocalTime.now();
//        System.out.println("Today: " + today);
//        System.out.println("Tomorrow: " + today.plusDays(1));
//        System.out.println("Yesterday: " + today.minusDays(1));
//        System.out.println("Add years: " + today.plusYears(3));
//        System.out.println("With YEAR: " + today.with(ChronoField.YEAR, 2018));
//        System.out.println("With DAY_OF_WEEK: " + today.with(ChronoField.DAY_OF_WEEK, 3));
//        System.out.println("With MONTH_OF_YEAR: " + today.with(ChronoField.MONTH_OF_YEAR, 7));
//    }
//
//    public static void exploreAdditionalMethodsOfLocalTime() {
//        System.out.println("********************* Exploring Additional Methods of LocalTime *********************");
//        LocalTime date = LocalTime.now();
//        LocalTime date1 = date.plusDays(1);
//        LocalTime leapYear = LocalTime.ofYearDay(2020, 20);
//        System.out.println("Leap Year: " + leapYear.isLeapYear());
//        System.out.println("Equal: " + date.equals(date1));
//        System.out.println("isBefore: " + date.isBefore(date1));
//        System.out.println("isAfter: " + date.isAfter(date1));
//        System.out.println("isSupported MINUTES: " + date.isSupported(ChronoUnit.MINUTES));
//        System.out.println("isSupported YEARS: " + date.isSupported(ChronoUnit.YEARS));
//    }

    public static void main(String[] args) {
        createLocalTime();
//        exploreLocalTimeProperties();
//        modifyingLocalTime();
//        exploreAdditionalMethodsOfLocalTime();
    }
}
