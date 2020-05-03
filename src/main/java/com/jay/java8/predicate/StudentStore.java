package com.jay.java8.predicate;

import com.jay.java8.model.Bike;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentStore {
    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike("ABC", "XYZ");

        Student student = new Student(1001L, "Ajay", "Yadav", LocalDate.of(1989, 3, 28),
                new Address("Indira Nagar", "UP", "Orai", "Jalaun", 218005), new Marks(65, 57, 62, 72, 86), Arrays.asList("Dancing", "Running", "Cooking"), 11, "Male");
        student.setBike(Optional.ofNullable(bike));
        return student;
    };

    private static List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student(1001L, "Ajay", "Yadav", LocalDate.of(1989, 3, 28),
                new Address("Indira Nagar", "UP", "Orai", "Jalaun", 218005), new Marks(65, 57, 62, 72, 86), Arrays.asList("Dancing", "Running", "Cooking"), 11, "Male"));
        students.add(new Student(1002L, "Jyoti", "Mahan", LocalDate.of(1988, 11, 20),
                new Address("Atrauliya", "UP", "Rath", "Hamirpur", 210431), new Marks(69, 63, 62, 57, 42), Arrays.asList("Dancing", "Writing"), 9, "Female"));
        students.add(new Student(1004L, "Ashok", "Gupta", LocalDate.of(1995, 7, 19),
                new Address("Ram Nagar", "MP", "Jabalpur", "dhar", 218005), new Marks(65, 57, 62, 72, 86), Arrays.asList("Running", "Dancing", "Reading"), 12, "Male"));
        students.add(new Student(1005L, "Nisha", "Sharma", LocalDate.of(1987, 11, 2),
                new Address("Rohini", "DL", "Delhi", "Delhi", 218005), new Marks(65, 57, 62, 72, 86), Arrays.asList("Writing", "Cooking", "Singing"), 13, "Female"));
        students.add(new Student(1006L, "Mohit", "Kesarwani", LocalDate.of(1996, 6, 11),
                new Address("Zero Road", "UP", "Allahabad", "Allahabad", 122017), new Marks(65, 57, 62, 72, 86), Arrays.asList("Dancing", "Cooking", "Sleeping"), 8, "Male"));
        students.add(new Student(1007L, "Ankit", "Rohilla", LocalDate.of(1989, 3, 28),
                new Address("Sector-14", "HR", "Gurgaon", "Gurgaon", 218005), new Marks(65, 57, 62, 72, 86), Arrays.asList("Singing", "Cooking", "Writing"), 11, "Male"));
        students.add(new Student(1003L, "Rashmi", "Gupta", LocalDate.of(1994, 12, 10),
                new Address("Indria Nagar", "UP", "Orai", "Jalaun", 218005), new Marks(65, 57, 62, 72, 88), Arrays.asList("Dancing", "Writing", "Running"), 9, "Female"));

        students.add(null);
    }

    public static List<Student> getStudents() {
        return students;
    }

}
