package com.jay.java8.streamapi.terminal;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    public static void groupingByGender() {
        Map<String, List<Student>> s = StudentStore.getStudents().stream().collect(groupingBy(Student::getGender));
        System.out.println("Student group by Gender: " + s);
    }

    public static void customizedGroupingByPCMPercentage() {
        Map<String, List<Student>> s = StudentStore.getStudents().stream()
                .collect(groupingBy(student -> student.getMarks().getPCMAvg() > 70 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println("Student group by PCMPercentage : " + s);
    }

    public static void twoLevelGroupingBy_1() {
        Map<String, Map<String, List<Student>>> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getGender, groupingBy(student -> student.getMarks().getPCMAvg() > 70 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println("Two level Grouping: " + twoLevelGrouping);
    }

    public static void twoLevelGroupingBy_2() {
        Map<String, Integer> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getGender, summingInt(Student::getNoteBooks)));

        System.out.println("No fo books Grouping by Gender: " + twoLevelGrouping);
    }

    public static void twoLevelGroupingBy_3() {
        Map<String, Integer> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getfName, summingInt(Student::getNoteBooks)));

        System.out.println("No fo books Grouping by Name: " + twoLevelGrouping);
    }

    public static void threeArgumentGroupingBy() {
        LinkedHashMap<String, Set<Student>> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getGender, LinkedHashMap::new, toSet()));

        System.out.println("threeArgumentGroupingBy: " + twoLevelGrouping);
    }

    public static void getTooperGenderWise() {
        Map<String, Optional<Student>> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getGender, maxBy(Comparator.comparing(Student::getNoteBooks))));

        System.out.println("threeArgumentGroupingBy: " + twoLevelGrouping);
    }

    public static void getlessBooksGenderWise() {
        Map<String, Student> twoLevelGrouping =
                StudentStore.getStudents().stream()
                        .collect(groupingBy(Student::getGender, collectingAndThen(minBy(Comparator.comparing(Student::getNoteBooks)), Optional::get)));

        System.out.println("threeArgumentGroupingBy: " + twoLevelGrouping);
    }

    public static void main(String[] args) {
//        groupingByGender();
//        customizedGroupingByPCMPercentage();
//        twoLevelGroupingBy_1();
//        twoLevelGroupingBy_2();
//        twoLevelGroupingBy_3();
//        threeArgumentGroupingBy();
        getTooperGenderWise();

        getlessBooksGenderWise();
    }
}
