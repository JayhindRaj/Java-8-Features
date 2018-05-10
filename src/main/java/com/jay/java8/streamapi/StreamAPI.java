package com.jay.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Jayhind Rajpoot
 * @Since May 9, 2018
 */
public class StreamAPI {

	public static void main(String[] args) {
		// SumOfIntegers();
//		personTest();
		
		streamToList();
		mapSorting();
		mapSortByValue();
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("AbC", 45);
		map.put("PQR", 63);
		map.put("Flag", 95);
		map.put("Dgdf", 4);
		map.put("Jay", 56);
		Map<String, Integer> Sortedmap = mapGenericSortingByValue(map);
		System.out.println("hfkshkfhsfhaskfhks");
		Sortedmap.forEach((K, V)->{System.out.println(K + ":" + V);});
	}

	public static void personTest() {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30, 2000.0),
				new Person("jack", 23, 78451.0), new Person("lawrence", 40,
						456321.02));

		// Searching person by name in the persons list
		Person p1 = persons.stream().filter(p -> p.getName().equals("jack"))
				.findAny().orElse(null);

		System.out.println(p1);

		// Print each person
		persons.forEach(System.out::println);

		// total salary
		double totalsalary = persons.stream().map(p -> p.getSalary())
				.collect(Collectors.toList()).stream()
				.mapToDouble(Double::doubleValue).sum();
		System.out.println("Total salary: " + totalsalary);

		// Avg age
		OptionalDouble avgAge = persons.stream().map(p -> p.getAge())
				.collect(Collectors.toList()).stream()
				.mapToInt(Integer::intValue).average();
		System.out.println("Average Age : " + avgAge);

		// Names of persons
		List<String> names = persons.stream().map(p -> p.getName())
				.collect(Collectors.toList());
		names.forEach(System.out::println);

		// Salary increment by 5000
		System.out.println("**************** salary increment by 5000 ****************");
		persons.forEach(p -> {p.setSalary(p.getSalary() + 5000);});
		persons.forEach(System.out::println);

		// Salary increment by 5%
		System.out.println("**************** salary increment by 5% ****************");
		persons.forEach(p -> {p.setSalary(p.getSalary() + ((p.getSalary() * 5)/100));});
		persons.forEach(System.out::println);
		
		Map<String, Double> pes = persons.stream().filter(p->{return (p.getSalary() >= 8000);}).collect(Collectors.toMap(p->p.getName(), p->p.getSalary()));
		
		System.out.println(pes);
	}

	public static <K, V extends Comparable<V>> Map<K, V> mapGenericSortingByValue(Map<K, V> map) {
		System.out.println("**************** Sort by Value ****************");
		// Ascending Order		
		Map<K, V> sortedMap =map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		sortedMap.forEach((K, V)->{System.out.println(K + ":" + V);});

		System.out.println("************* Reverse Order ");
		// Descending Order
		Map<K, V> sortedRevMap =map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		
				sortedRevMap.forEach((K, V)->{System.out.println(K + ":" + V);});
				return sortedMap;
	}
	
	
	public static void mapSorting() {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("AbC", 45);
		map.put("PQR", 63);
		map.put("Flag", 95);
		map.put("Dgdf", 4);
		map.put("Jay", 56);
		
		// Ascending Order		
		Map<String, Integer> sortedMap =map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		sortedMap.forEach((K, V)->{System.out.println(K + ":" + V);});

		System.out.println("************* Reverse Order ");
		// Descending Order
		Map<String, Integer> sortedRevMap =map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		
				sortedRevMap.forEach((K, V)->{System.out.println(K + ":" + V);});
	}

	public static void mapSortByValue() {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("AbC", 45);
		map.put("PQR", 63);
		map.put("Flag", 95);
		map.put("Dgdf", 4);
		map.put("Jay", 56);
		System.out.println("**************** Sort by Value ****************");
		// Ascending Order		
		Map<String, Integer> sortedMap =map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		sortedMap.forEach((K, V)->{System.out.println(K + ":" + V);});

		System.out.println("************* Reverse Order ");
		// Descending Order
		Map<String, Integer> sortedRevMap =map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)->oldValue, LinkedHashMap::new));
		
				sortedRevMap.forEach((K, V)->{System.out.println(K + ":" + V);});
	}
	
	public static void SumOfIntegers() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(37);
		integers.add(45);
		integers.add(29);
		integers.add(20);

		// Sum of integers in list
		int sum1 = integers.stream().mapToInt(Integer::intValue).sum();
		int sum2 = integers.stream().collect(
				Collectors.summingInt(Integer::intValue));
		System.out.println(sum1);
		System.out.println(sum2);

		// Searching integer Element in the list
		int i = integers.stream().filter(x -> {return (x == 3);}).findAny().orElse(0);
		int j = integers.stream().filter(x -> {return (x == 37);}).findAny().orElse(0);
		int k = integers.stream().filter(x -> {return (x == 24);}).findAny().orElse(12);
		
		System.out.println("I: " + i);
		System.out.println("J: " + j);
		System.out.println("K: " + k);
	}
	
	public static void streamToList() {
		Stream<String> stream = Stream.of("Java", "Python", "Scala", ".Net");
		List<String> list = stream.collect(Collectors.toList());
		list.forEach(System.out::println);
		
		
		  Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);

//	        List<Integer> result2 = number.filter(x -> x!= 3).collect(Collectors.toList());

//	        List<Integer> result3 = number.filter(x -> x > 2).collect(Collectors.toList());
//	        
	        List<Integer> result4 = number.filter(x -> x< 9).collect(Collectors.toList());
	        
//	        result2.forEach(x -> System.out.println(x));
	        
//	        result2.forEach(System.out::println);
//	        result3.forEach(System.out::println);
	        result4.forEach(System.out::println);
	        
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
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
}