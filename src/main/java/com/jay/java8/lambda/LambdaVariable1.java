package com.jay.java8.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {
	static int value1 = 4;
	public static void main(String[] args) {
		
//		int value = 4;
		Consumer<Integer> c1 = i -> {
//			value++; this is not allowed because value is local variable
			value1++;
			System.out.println(value1 + i);
		};
		
		c1.accept(7);
	}
}
