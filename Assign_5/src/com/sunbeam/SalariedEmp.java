package com.sunbeam;
import java.util.Scanner;

public class SalariedEmp extends Employee {

	private double weeklySal;
	Scanner sc=new Scanner(System.in);
	
    public SalariedEmp() {
    	
    }
	
	public double getWeeklySal() {
		return weeklySal;
	}
	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter the weekly salary : ");
		this.weeklySal=sc.nextDouble();
	}
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Total salary of weekly paid employee : "+this.getWeeklySal());
		
	}
	@Override
	public String toString() {
		return "SalariedEmp [weeklySal=" + weeklySal + ", sc=" + sc + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSSN()=" + getSSN() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
