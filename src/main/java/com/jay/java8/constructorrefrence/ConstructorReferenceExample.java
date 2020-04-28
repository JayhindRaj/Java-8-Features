package com.jay.java8.constructorrefrence;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.jay.java8.predicate.Student;

public class ConstructorReferenceExample {
	// Constructor reference with one argument
	static Supplier<Student> stu = Student::new;
	// Constructor reference with one argument
	static Function<String, Student> stu1 = Student::new;
	// Constructor reference with one argument
	static BiFunction<Long, String, Student> stu2 = Student::new;
	
	public static void main(String[] args) {
		System.out.println(stu.get());
		System.out.println(stu1.apply("Jayhind"));
		System.out.println(stu2.apply(1234L, "Ajay"));
	}
}
