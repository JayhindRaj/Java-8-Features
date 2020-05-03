package com.jay.java8.optional;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import java.util.Optional;

public class OptionalExample {

    public static String optionalOrElse() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getfName).orElse("Default");
    }

    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getfName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentStore.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getfName).orElseThrow(() -> new RuntimeException("No data available."));
    }

    public static void main(String[] args) {
        System.out.println("Name: orElse: " + optionalOrElse());
        System.out.println("Name: orElseGet: " + optionalOrElseGet());
        System.out.println("Name: orElseThrow: " + optionalOrElseThrow());
    }
}
