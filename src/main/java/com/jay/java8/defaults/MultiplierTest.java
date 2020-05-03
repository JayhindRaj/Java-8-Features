package com.jay.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierTest {

    public static void main(String[] args) {
        Multiplier multiplier
                = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(2, 3, 5, 6);
        System.out.println("Result is : " + multiplier.multiply(integerList));
        System.out.println("Size is : " + multiplier.size(integerList));
        System.out.println("isEmpty : " + Multiplier.isEmpty(integerList));
        multiplier.print(integerList);

    }
}
