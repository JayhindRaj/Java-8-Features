package com.jay.java8.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 
 * This class <StreamsReduceExample.java> provides the functionality ..
 *
 * @author jayrajpo
 * @Since Apr 29, 2020
 */
public class StreamsReduceExample {

	public static int performMultiplication(List<Integer> integers) {
		return integers.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> performMultiplicationWithOutIdentity(List<Integer> integers) {
		return integers.stream().reduce((a, b) -> a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> integers = Arrays.asList(1, 4, 7, 9);

		System.out.println(performMultiplication(integers));

		Optional<Integer> op = performMultiplicationWithOutIdentity(integers);
		System.out.println(op.isPresent());
		System.out.println(op.get());

		List<Integer> integers2 = Collections.emptyList();
		Optional<Integer> op2 = performMultiplicationWithOutIdentity(integers2);
		System.out.println(op2.isPresent());
//		System.out.println(op.get());

	}
}
