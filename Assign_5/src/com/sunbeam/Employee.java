package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private int SSN;
    Scanner sc=new Scanner(System.in);
	
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int SSN) {
		this.SSN = SSN;
	}
	
	public void acceptData() {
		System.out.print("Enter the first name : ");
		this.firstName=sc.next();
		System.out.print("Enter the last name : ");
		this.lastName=sc.next();
		System.out.print("Enter the Employee SSN: ");
		this.SSN=sc.nextInt();
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	abstract void calculateSalary();
	
	
}
