package com.jay.java8.streamapi;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Set;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

/**
 * 
 * This class <StreamsFlatMapExample.java> provides the functionality ..
 *
 * @author jayrajpo
 * @Since Apr 29, 2020
 */
public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {
		return StudentStore.getStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.collect(toList()); // List<String>
	}

	public static List<String> printStudentActivitiesUnique() {
		return StudentStore.getStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct()
				.sorted() // Sorted in natural Order
				.collect(toList()); // List<String>
	}
	
	public static Set<String> printStudentActivitiesSet() {
		return StudentStore.getStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.collect(toSet()); // Set<String>
	}
	
	public static long printStudentActivitiesCount() {
		return StudentStore.getStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct() // Unique
				.count();
	}

	public static void main(String[] args) {
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesSet());
		System.out.println(printStudentActivitiesUnique());
		System.out.println(printStudentActivitiesCount());
	}

}
