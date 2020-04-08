package com.jay.java8.predicate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentService {
	private static Predicate<Student> ageGtn25 = (
			stu) -> (stu.getDob().until(LocalDate.of(2020, 03, 01), ChronoUnit.YEARS) >= 25);
	private static Predicate<Student> belongsToUP = (stu) -> (stu.getAddress().getState().equals("UP"));
	private static Predicate<Student> pcmGt78 = (stu) -> (stu.getMarks().getPCMAvg() >= 72.0);

	private static Function<List<Student>, List<Student>> meritList = (list) -> {
		list = list.stream().filter(ageGtn25.and(belongsToUP).and(pcmGt78)).collect(Collectors.toList()).stream()
				.sorted((s1, s2) -> {
					return s1.getDob().compareTo(s2.getDob());
				}).collect(Collectors.toList());
		return list;
	};

	public static void main(String[] args) {
		List<Student> selectedStudent = meritList.apply(StudentStore.getStudents());
		selectedStudent.forEach(System.out::println);
	}
}
