package com.sunbeam.assign3;

import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private double salary;
	private int age;
	Scanner sc=new Scanner(System.in);
	
	public Employee() {
		
	}
	
//	public Employee(String name, int id, double salary, int age) {
//		this.name = name;
//		this.id = id;
//		this.salary = salary;
//		this.age = age;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void accept() {
		System.out.println("Enter the id : ");
		this.id=sc.nextInt();
		
		System.out.println("Enter the salary : ");
		this.salary=sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.id==other.id)
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee other) {
		int diff=this.id-other.id;
		return diff;
	}
	
}
