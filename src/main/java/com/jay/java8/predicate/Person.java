package com.jay.java8.predicate;

import java.time.LocalDate;

public class Person {
	private LocalDate dob;
	private String name;
	private double income;

	public Person(LocalDate dob, String name, double income) {
		this.dob = dob;
		this.name = name;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [dob=" + dob + ", name=" + name + ", income=" + income + "]";
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
