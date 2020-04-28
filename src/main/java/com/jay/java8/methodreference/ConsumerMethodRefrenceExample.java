package com.jay.java8.methodreference;

import java.util.function.Consumer;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

public class ConsumerMethodRefrenceExample {

	static Consumer<Student> c1 = Student::printMarks;
	static Consumer<Student> c2 = System.out::println;
	
	public static void main(String[] args) {
		
		StudentStore.getStudents().forEach(c2);
		StudentStore.getStudents().forEach(c1);
	}
}
