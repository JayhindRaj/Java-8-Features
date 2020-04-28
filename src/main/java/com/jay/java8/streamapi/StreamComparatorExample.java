package com.jay.java8.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

public class StreamComparatorExample {

	public static List<Student> sortStudentByName() {
		 return StudentStore.getStudents().stream().sorted(Comparator.comparing(Student::getfName)).collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByNameDesc() {
		 return StudentStore.getStudents().stream().sorted(Comparator.comparing(Student::getfName).reversed())
				 .collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByDOB() {
		 return StudentStore.getStudents().stream().sorted(Comparator.comparing(Student::getDob)).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Sorted BY Name: ");
		sortStudentByName().stream().forEach(System.out::println);
		
		System.out.println("Sorted BY Name desc : ");
		sortStudentByNameDesc().stream().forEach(System.out::println);
		
		
		System.out.println("Sorted BY DOB: ");
		sortStudentByDOB().stream().forEach(System.out::println);
	}

}
