package com.jay.java8.predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentStore {

	private static List<Student> students;
	public static List<Student> getStudents() {
		return students;
	}
	static {
		students = new ArrayList<>();
		students.add(new Student(1001L, "Ajay", "Yadav", LocalDate.of(1989, 3, 28),
				new Address("Indria Nagar", "UP", "Orai", "Jalaun", 218005),new Marks(65, 57, 62, 72, 86)));
		students.add(new Student(1002L, "Jyoti", "Mahan", LocalDate.of(1988, 11, 20),
				new Address("Atrauliya", "UP", "Rath", "Hamirpur", 210431),new Marks(69, 63, 62, 57, 42)));
		students.add(new Student(1004L, "Ashok", "Gupta", LocalDate.of(1995, 7, 19),
				new Address("Ram Nagar", "MP", "Jabalpur", "dhar", 218005),new Marks(65, 57, 62, 72, 86)));
		students.add(new Student(1005L, "Ankur", "Sharma", LocalDate.of(1987, 11, 02),
				new Address("Rohini", "DL", "Delhi", "Delhi", 218005),new Marks(65, 57, 62, 72, 86)));
		students.add(new Student(1006L, "Mohit", "Kesarwani", LocalDate.of(1996, 06, 11),
				new Address("Zero Road", "UP", "Allahabad", "Allahabad", 122017),new Marks(65, 57, 62, 72, 86)));
		students.add(new Student(1007L, "Ankit", "Rohilla", LocalDate.of(1989, 3, 28),
				new Address("Sector-14", "HR", "Gurgaon", "Gurgaon", 218005),new Marks(65, 57, 62, 72, 86)));
		students.add(new Student(1003L, "Ratnesh", "Gupta", LocalDate.of(1994, 12, 10),
				new Address("Indria Nagar", "UP", "Orai", "Jalaun", 218005),new Marks(65, 57, 62, 72, 88)));
		
	}
	
}
