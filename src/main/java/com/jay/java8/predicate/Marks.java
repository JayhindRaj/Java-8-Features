package com.jay.java8.predicate;

public class Marks {
	private int hindi;
	private int english;
	private int physics;
	private int chemistry;
	private int math;

	@Override
	public String toString() {
		return "Marks [hindi=" + hindi + ", english=" + english + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", math=" + math + ", PCMAvg=" + getPCMAvg() + "]";
	}

	public Marks(int hindi, int english, int physics, int chemistry, int math) {
		super();
		this.hindi = hindi;
		this.english = english;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public double getPCMAvg() {
		return (physics + chemistry + math) / 3;
	}
}
