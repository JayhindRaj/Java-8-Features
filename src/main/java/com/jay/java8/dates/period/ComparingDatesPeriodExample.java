package com.jay.java8.dates.period;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2015, 11, 19);
        System.out.println("localDate1: " + localDate1);
        System.out.println("localDate2: " + localDate2);
        Period period = localDate2.until(localDate1);
        System.out.println("Period: " + period);
        System.out.println("getDays: " + period.getDays());
        System.out.println("getMonths: " + period.getMonths());
        System.out.println("getYears: " + period.getYears());

        Period period1 = Period.ofDays(20);
        System.out.println("Days: " + period1.getDays());
        Period period2 = Period.ofYears(10);
        System.out.println("Years: " + period2.getYears());
        System.out.println("TotalMonths: " + period2.toTotalMonths());

        Period period3 = Period.between(localDate1, localDate2);
        System.out.println("period3: " + period3);

        System.out.println("Days: " + period3.getDays() + " Months: " + period3.getMonths() + " Years: " + period3.getYears());

    }
}
