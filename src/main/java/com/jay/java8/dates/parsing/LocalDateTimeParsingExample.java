package com.jay.java8.dates.parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeParsingExample {
    public static void localDateParsing() {
        System.out.println("*************** LocalDate Parsing ***************");

        String date = "2020-05-07";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate: " + localDate);

        LocalDate localDate2 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate2: " + localDate2);

        String date1 = "20200506";
        LocalDate localDate3 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate3: " + localDate3);

        String customdate1 = "2020|05|06";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate4 = LocalDate.parse(customdate1, dateTimeFormatter);
        System.out.println("localDate4: " + localDate4);

        String customdate2 = "2020.05/06";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy.MM/dd");
        LocalDate localDate5 = LocalDate.parse(customdate2, dateTimeFormatter2);
        System.out.println("localDate5: " + localDate5);

        String customdate3 = "2020*05*06";
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate6 = LocalDate.parse(customdate3, dateTimeFormatter3);
        System.out.println("localDate6: " + localDate6);
    }

    public static void localTimeParsing() {
        System.out.println("*************** LocalTime Parsing ***************");

        String date = "19:21";
        LocalTime localTime = LocalTime.parse(date);
        System.out.println("localTime: " + localTime);

        LocalTime localTime2 = LocalTime.parse(date, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localDate2: " + localTime2);

        String customdate7 = "23/05/06";
        DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("HH/mm/ss");
        LocalTime localTime3 = LocalTime.parse(customdate7, dateTimeFormatter7);
        System.out.println("localDate3: " + localTime3);

        String customdate1 = "23|05|06";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime4 = LocalTime.parse(customdate1, dateTimeFormatter);
        System.out.println("localDate4: " + localTime4);

        String customdate2 = "21.05/06";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH.mm/ss");
        LocalTime localTime5 = LocalTime.parse(customdate2, dateTimeFormatter2);
        System.out.println("localDate5: " + localTime5);

        String customdate3 = "12*35*46";
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime6 = LocalTime.parse(customdate3, dateTimeFormatter3);
        System.out.println("localDate6: " + localTime6);
    }

    public static void localDateTimeParsing() {
        System.out.println("*************** LocalDateTime Parsing ***************");
        String dateTime = "2020-05-07T02:23:47";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime2: " + localDateTime2);

        String customdate1 = "2020/05/06T04/45/12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH/mm/ss");
        LocalDateTime localDateTime4 = LocalDateTime.parse(customdate1, dateTimeFormatter);
        System.out.println("localDateTime4: " + localDateTime4);

        String customdate2 = "2020.05/14T14*12.45";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy.MM/dd'T'HH*mm.ss");
        LocalDateTime localDateTime5 = LocalDateTime.parse(customdate2, dateTimeFormatter2);
        System.out.println("localDateTime5: " + localDateTime5);

        String customdate3 = "2020.05.06ABC03*29*37";
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy.MM.dd'ABC'HH*mm*ss");
        LocalDateTime localDateTime6 = LocalDateTime.parse(customdate3, dateTimeFormatter3);
        System.out.println("localDateTime6: " + localDateTime6);
    }

    public static void main(String[] args) {
        localDateParsing();
        localTimeParsing();
        localDateTimeParsing();
    }
}
