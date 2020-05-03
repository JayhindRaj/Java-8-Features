package com.jay.java8.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void createLocalDate() {
        System.out.println("********************* LocalDate Creation *********************");
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);
        LocalDate localDate1 = LocalDate.of(2020, Month.MAY, 2);
        System.out.println("LocalDate1 : " + localDate1);
        LocalDate localDate2 = LocalDate.of(2020, 4, 30);
        System.out.println("LocalDate2 : " + localDate2);
        LocalDate localDate3 = LocalDate.ofYearDay(2020, 124);
        System.out.println("localDate3 : " + localDate3);
        LocalDate localDate4 = LocalDate.ofEpochDay(6730678933L);
        System.out.println("LocalDate4 : " + localDate4);
    }

    public static void exploreDatePropertiesOfLocalDate() {
        System.out.println("********************* exploreDateProperties *********************");
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);
        System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
        System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());
        System.out.println("MONTH_OF_YEAR : " + localDate.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("getEra : " + localDate.getEra());
        System.out.println("getChronology : " + localDate.getChronology());
        System.out.println("MONTH_OF_YEAR : " + localDate.getLong(ChronoField.MONTH_OF_YEAR));
    }

    public static void modifyingLocalDate() {
        System.out.println("********************* Modification of LocalDate *********************");
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Yesterday: " + today.minusDays(1));
        System.out.println("Add years: " + today.plusYears(3));
        System.out.println("With YEAR: " + today.with(ChronoField.YEAR, 2018));
        System.out.println("With DAY_OF_WEEK: " + today.with(ChronoField.DAY_OF_WEEK, 3));
        System.out.println("With MONTH_OF_YEAR: " + today.with(ChronoField.MONTH_OF_YEAR, 7));
    }

    public static void exploreAdditionalMethodsOfLocalDate() {
        System.out.println("********************* Exploring Additional Methods of LocalDate *********************");
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusDays(1);
        LocalDate leapYear = LocalDate.ofYearDay(2020, 20);
        System.out.println("Leap Year: " + leapYear.isLeapYear());
        System.out.println("Equal: " + date.equals(date1));
        System.out.println("isBefore: " + date.isBefore(date1));
        System.out.println("isAfter: " + date.isAfter(date1));
        System.out.println("isSupported MINUTES: " + date.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported YEARS: " + date.isSupported(ChronoUnit.YEARS));
    }

    public static void main(String[] args) {
        createLocalDate();
        exploreDatePropertiesOfLocalDate();
        modifyingLocalDate();
        exploreAdditionalMethodsOfLocalDate();
    }
}
