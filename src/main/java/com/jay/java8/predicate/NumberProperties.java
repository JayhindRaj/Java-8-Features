package com.jay.java8.predicate;

import java.util.function.Predicate;

public class NumberProperties {

private static Predicate<Integer> isOdd =  (i) -> {return i %2 != 0;};

 



public static boolean isOdd(int i) {
	 return isOdd.test(i);
}

public static void main(String[] args) {
//	System.out.println(isOdd(26));
//	System.out.println(isOdd(37));
//	System.out.println(isOdd(51));
//	System.out.println(isOdd(108));
	
	
}
}
