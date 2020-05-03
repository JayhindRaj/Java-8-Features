package com.jay.java8.optional;

import com.jay.java8.model.Bike;
import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());
        studentOptional.filter(student -> student.getMarks().getPCMAvg() > 72).ifPresent(System.out::println);
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> s = studentOptional.map(Student::getfName);
            s.ifPresent(System.out::println);
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());
        Optional<String> bikeName = studentOptional.filter(student -> student.getMarks().getPCMAvg() > 72).flatMap(Student::getBike).map(Bike::getName);
        bikeName.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
