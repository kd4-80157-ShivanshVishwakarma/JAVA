package com.sunbeam.generic;
import java.util.Scanner;

abstract class Employee {
//	private String name;
//	private age;
	private int id;
	private double salary;
	Scanner sc=new Scanner(System.in);
	
	abstract double totalSal();
	
//	public Employee(int id, double salary) {
////		super();
//		this.id = id;
//		this.salary = salary;
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
	
	public void accept() {
		System.out.println("Enter the id : ");
		this.id=sc.nextInt();
		
		System.out.println("Enter the salary : ");
		this.salary=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
}
