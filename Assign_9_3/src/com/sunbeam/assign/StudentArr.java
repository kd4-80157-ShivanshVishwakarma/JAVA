package com.sunbeam.assign;
import java.util.Scanner;
import java.util.Comparator;

public class StudentArr implements Comparable<StudentArr> {
	private int roll;
	private String name;
	private String city;
	private double marks;
	Scanner sc=new Scanner(System.in);
	
	public StudentArr(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentArr [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(StudentArr other) {
		int diff=this.roll-other.roll;
		return diff;
	}
	

}
