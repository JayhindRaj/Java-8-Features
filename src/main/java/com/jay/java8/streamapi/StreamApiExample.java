package com.jay.java8.streamapi;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.jay.java8.predicate.Marks;
import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

public class StreamApiExample {

	static Predicate<Student> fromUP = stu -> stu.getAddress().getState().equalsIgnoreCase("up");
	static Predicate<Student> pcmGrade = stu -> stu.getMarks().getPCMAvg() >= 72.0;

	public static void main(String[] args) {
		Map<String, Marks> studentMarks = StudentStore.getStudents().stream()
				.filter(fromUP)
				.filter(pcmGrade)
				.collect(Collectors.toMap(Student::getfName, Student::getMarks));
		System.out.println(studentMarks);
	}
}
