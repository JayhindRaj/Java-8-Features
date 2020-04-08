package com.jay.java8.predicate;

import java.time.LocalDate;

public class Student {
	private Long studentId;
	private String fName;
	private String lName;
	private LocalDate dob;
	private Address address;
	private Marks marks;

	public Student(Long studentId, String fName, String lName, LocalDate dob, Address address, Marks marks) {
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.address = address;
		this.marks = marks;
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

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob
				+ ", address=" + address + ", marks=" + marks + "]";
	}
}
