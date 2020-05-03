package com.jay.java8.defaults;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
    static Consumer<Student> studentConsumer = (System.out::println);
    static Comparator<Student> comparatorNoteBook = Comparator.comparing(Student::getNoteBooks);
    static Comparator<Student> comparatorByGender = Comparator.comparing(Student::getGender);

    public static void sortByName(List<Student> studentList) {
        System.out.println("After the sorting by Name.");
        Comparator<Student> studentComparatorByName = Comparator.comparing(Student::getfName);
        studentList.sort(studentComparatorByName);
        studentList.forEach(studentConsumer);
    }

    public static void sortByNoOfBooks(List<Student> studentList) {
        System.out.println("After sorting by No of books.");
        studentList.sort(comparatorNoteBook);
        studentList.forEach(studentConsumer);

    }

    public static void comparatorChain(List<Student> studentList) {
        System.out.println("After comparator chaining.. ");
        studentList.sort(comparatorByGender.thenComparing(comparatorNoteBook));
        studentList.forEach(studentConsumer);
    }


    public static void sortWithNullsLast(List<Student> studentList) {
        System.out.println("After sortWithNullsLast.. ");
        Comparator<Student> comparator = Comparator.nullsLast(comparatorByGender);
        studentList.sort(comparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullsFirst(List<Student> studentList) {
        System.out.println("After sortWithNullsFirst. ");
        Comparator<Student> comparator = Comparator.nullsFirst(comparatorByGender);
        studentList.sort(comparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> s = StudentStore.getStudents();
        System.out.println("Before the sorting..");
        s.forEach(studentConsumer);

//        sortByName(s);
//        sortByNoOfBooks(s);
//        comparatorChain(s);
        sortWithNullsFirst(s);
        sortWithNullsLast(s);
    }

}
