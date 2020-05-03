package com.jay.java8.streamapi;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

public class StreamMapReduceExample {
    public static int getNoOfBooks() {
        return StudentStore.getStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Total no of books: " + getNoOfBooks());
        System.out.println("Total no of books required in UP : " + StudentStore.getStudents().stream()
                .filter(stu -> stu.getAddress().getState().equalsIgnoreCase("up"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum));
        System.out.println("Total no of books whose PCM % > 70: " + StudentStore.getStudents()
                .stream()
                .filter(stu -> stu.getMarks().getPCMAvg() > 70)
                .map(Student::getNoteBooks)
                .reduce(0, (a, b) -> a + b));
        System.out.println("Total no of books required for Girls: " + +StudentStore.getStudents()
                .stream()
                .filter(stu -> stu.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum));
    }
}
