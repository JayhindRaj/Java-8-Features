package com.jay.java8.streamapi.terminal;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {
    public static void main(String[] args) {
        System.out.println("Joining 1: " + StudentStore.getStudents().stream().map(Student::getfName).collect(joining()));
        System.out.println("Joining 2: " + StudentStore.getStudents().stream().map(Student::getfName).collect(joining("-")));
        System.out.println("Joining 3: " + StudentStore.getStudents().stream().map(Student::getfName).collect(joining(",", "(", ")")));
    }
}
