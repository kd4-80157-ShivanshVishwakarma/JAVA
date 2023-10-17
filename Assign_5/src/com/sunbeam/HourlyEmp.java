package com.sunbeam;
import java.util.Scanner;

public class HourlyEmp extends Employee {
	
	private double hourlyWage;
	private int hourlyWork;
	Scanner sc=new Scanner(System.in);
	
	public HourlyEmp() {
    	
    }
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHourlyWork() {
		return hourlyWork;
	}
	public void setHourlyWork(int hourlyWork) {
		this.hourlyWork = hourlyWork;
	}
	public void acceptData() {
		
		super.acceptData();
		System.out.print("Enter the Hourly wage : ");
		this.hourlyWage=sc.nextDouble();
		
		System.out.print("Enter the Hourly worked time : ");
		this.hourlyWork=sc.nextInt();
	}
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		if(this.getHourlyWork()<=40) {
			System.out.println("Total salary of hourly paid employee : "+this.getHourlyWage()*this.hourlyWork);
		}
		else if(this.getHourlyWork()>40) {
			System.out.println("Total salary including overtime of hourly paid employee  : "+40*this.hourlyWage+((this.hourlyWork-40)*this.hourlyWage*1.5));
		}
	}
	@Override
	public String toString() {
		return "HourlyEmp [hourlyWage=" + hourlyWage + ", hourlyWork=" + hourlyWork + ", sc=" + sc + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getSSN()=" + getSSN() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
