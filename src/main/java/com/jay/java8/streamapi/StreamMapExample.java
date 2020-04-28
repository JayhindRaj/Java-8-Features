package com.jay.java8.streamapi;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.jay.java8.predicate.Student;
import com.jay.java8.predicate.StudentStore;

/**
 * 
 * This class <StreamMapExample.java> demonstrates the Map functionality of Stream API.
 *
 * @author jayrajpo
 * @Since Apr 29, 2020
 */
public class StreamMapExample {

	public static List<String> getNameList() {
		return StudentStore.getStudents().stream().map(Student::getfName).map(String::toUpperCase).collect(toList());
	}

	public static Set<String> getNameSet() {
		return StudentStore.getStudents().stream().map(Student::getfName).collect(toSet());
	}

	public static void main(String[] args) {
		System.out.println(getNameList());
		System.out.println(getNameSet());
	}
}
