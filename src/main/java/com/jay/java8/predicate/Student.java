package com.jay.java8.predicate;

import java.time.LocalDate;
import java.util.List;

public class Student {
	private Long studentId;
	private String fName;
	private String lName;
	private LocalDate dob;
	private Address address;
	public Marks marks;
	private List<String> activities;
	
	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String fname) {
		this.fName = fname;
	}
	
	public Student(Long id ,String fname) {
		this.fName = fname;
		this.studentId = id;
	}
	public Student(Long studentId, String fName, String lName, LocalDate dob, Address address, Marks marks, List<String> activities) {
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.address = address;
		this.marks = marks;
		this.activities = activities;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printMarks() {
		System.out.println(marks);
	}
	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob
				+ ", address=" + address + ", marks=" + marks + ", activities=" + activities + "]";
	}
}
