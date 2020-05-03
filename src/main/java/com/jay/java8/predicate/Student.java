package com.jay.java8.predicate;

import com.jay.java8.model.Bike;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Student {
    public Marks marks;
    private Long studentId;
    private String fName;
    private String lName;
    private LocalDate dob;
    private Address address;
    private List<String> activities;
    private int noteBooks;
    private String gender;
    private Optional<Bike> bike = Optional.empty();

    public Student() {
    }

    public Student(String fName) {
        this.fName = fName;
    }

    public Student(Long id, String fName) {
        this.fName = fName;
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

    public Student(Long studentId, String fName, String lName, LocalDate dob, Address address, Marks marks, List<String> activities, int noteBooks) {
        this.studentId = studentId;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.address = address;
        this.marks = marks;
        this.activities = activities;
        this.noteBooks = noteBooks;
    }

    public Student(Long studentId, String fName, String lName, LocalDate dob, Address address, Marks marks, List<String> activities, int noteBooks, String gender) {
        this.studentId = studentId;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.address = address;
        this.marks = marks;
        this.activities = activities;
        this.noteBooks = noteBooks;
        this.gender = gender;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", marks=" + marks +
                ", activities=" + activities +
                ", noteBooks=" + noteBooks +
                ", gender='" + gender + '\'' +
                ", bike=" + bike +
                '}';
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

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}