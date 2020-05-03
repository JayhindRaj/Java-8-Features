package com.jay.java8.streamapi.terminal;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartioningByExample {

    public static void partioningBy_1() {
        Predicate<Student> predicate = stu -> stu.getMarks().getPCMAvg() > 72;
        Map<Boolean, List<Student>> s = StudentStore.getStudents().stream()
                .collect(Collectors.partitioningBy(predicate));

        System.out.println(s);
    }

    public static void partioningBy_2() {
        Predicate<Student> predicate = stu -> stu.getMarks().getPCMAvg() > 72;
        Map<Boolean, Set<Student>> s = StudentStore.getStudents().stream()
                .collect(Collectors.partitioningBy(predicate, Collectors.toSet()));

        System.out.println(s);
    }

    public static void main(String[] args) {
        partioningBy_1();
        partioningBy_2();
    }
}
