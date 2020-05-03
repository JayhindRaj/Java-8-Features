package com.jay.java8.streamapi;

import com.jay.java8.predicate.StudentStore;

public class StreamMatchExample {

    public static boolean allMatch() {
        return StudentStore.getStudents().stream()
                .allMatch(student -> student.getMarks().getPCMAvg() > 75);
    }

    public static void main(String[] args) {
        System.out.println("Is All student have % > 75: " + allMatch());
        System.out.println("Is Any student belong to UP: " + StudentStore.getStudents().stream()
                .anyMatch(student -> student.getAddress().getState().equalsIgnoreCase("up")));
        System.out.println("No student have % < 40: " + StudentStore.getStudents().stream()
                .noneMatch(student -> student.getMarks().getPCMAvg() < 40));
    }
}
