package com.jay.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUpperCase1 = String::toUpperCase;
	static Function<String, String> toUpperCase2 = (s)->s.toUpperCase();
	
	public static void main(String[] args) {
	
		System.out.println("Uppper case using method refrence: " + toUpperCase1.apply("jayhind"));
		System.out.println("Uppper case : " + toUpperCase2.apply("jayhind"));
		
	}
}
