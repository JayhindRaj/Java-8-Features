package com.jay.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * 
 * @author Jayhind Rajpoot
 * @Since May 9, 2018
 */
public class ListOperations {

	public static void main(String[] args) {
		SumOfIntegers();
	}

	public static void SumOfIntegers() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(37);
		integers.add(45);
		integers.add(29);
		integers.add(20);

		int i = integers.stream().filter(x -> {
			return x == new Integer(45);
		}).findAny().orElse(0);

		System.out.println(i);

		List<Person> persons = Arrays.asList(new Person("mkyong", 30, 2000.0),
				new Person("jack", 23, 78451.0), new Person("lawrence", 40, 456321.02));

		Person p1 = persons.stream().filter(p -> p.getName().equals("jack"))
				.findAny().orElse(null);

		System.out.println(p1);
		
//		int sum = integers.stream().mapToInt(i -> i.intValue()).sum();
		int sum1 = integers.stream().mapToInt(Integer::intValue).sum();
		int sum2 = integers.stream().collect(Collectors.summingInt(Integer::intValue));
		
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		persons.forEach(System.out::println);
		double totalsalary = persons.stream().map(p->p.getSalary()).collect(Collectors.toList()).stream().mapToDouble(Double::doubleValue).sum();
		OptionalDouble avgAge = persons.stream().map(p->p.getAge()).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).average();
		List<String> names = persons.stream().map(p->p.getName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("Total salary: " + totalsalary);
		System.out.println("Average Age : " + avgAge);
	}

}

class Person {
	private String name;
	private int age;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Person(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.salary = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age +", salary=" + salary + "]";
	}

}