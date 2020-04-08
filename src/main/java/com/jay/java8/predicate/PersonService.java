package com.jay.java8.predicate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService {

	private static Predicate<Person> isRich = (p) -> p.getIncome() > 1000000.00;
	private static Predicate<Person> isSeniorCitizen = (
			p) -> (p.getDob().until(LocalDate.now(), ChronoUnit.YEARS) >= 60);
	private static Function<List<Person>, List<Person>> oldAndRich = (list) -> list.stream()
			.filter(isSeniorCitizen.and(isRich)).collect(Collectors.toList());
//	private static BiFunction<Person, Person, Integer> sortByName = (p1, p2) -> {
//		return p1.getName().compareTo(p2.getName());
//	};

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(LocalDate.of(1989, 07, 02), "Jayhind", 1500000.00));
		persons.add(new Person(LocalDate.of(1989, 03, 18), "Mohit", 500000.00));
		persons.add(new Person(LocalDate.of(1955, 07, 15), "Shambhu", 2300000.00));
		persons.add(new Person(LocalDate.of(1982, 8, 22), "Suresh", 5500000.00));
		persons.add(new Person(LocalDate.of(1964, 01, 29), "Rajesh", 700000.00));
		persons.add(new Person(LocalDate.of(1961, 12, 03), "Kamal", 300000.00));
		persons.add(new Person(LocalDate.of(1989, 06, 17), "Hari", 940000.00));
		persons.add(new Person(LocalDate.of(1959, 9, 12), "Vinod", 1400000.00));
		persons.add(new Person(LocalDate.of(1947, 11, 26), "Ramesh", 1230000.00));

		List<Person> pe = oldAndRich.apply(persons);
		pe = pe.stream().sorted((p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		}).collect(Collectors.toList());
		pe.forEach(System.out::println);
	}
}
