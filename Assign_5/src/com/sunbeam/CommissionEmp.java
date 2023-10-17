package com.sunbeam;
import java.util.Scanner;

public class CommissionEmp extends Employee{

	private double grossSales;
	private double commRate;
	Scanner sc=new Scanner(System.in);
	
	public CommissionEmp() {
    	
    }
	
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter the gross sales : ");
		this.grossSales=sc.nextDouble();
		
		System.out.print("Enter the commission rate of employee : ");
		this.commRate=sc.nextDouble();
	}
	
	
	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getCommRate() {
		return commRate;
	}


	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}
	
	
	
	@Override
	public String toString() {
		return "CommissionEmp [grossSales=" + grossSales + ", commRate=" + commRate + ", sc=" + sc
				+ ", getGrossSales()=" + getGrossSales() + ", getCommRate()=" + getCommRate() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getSSN()=" + getSSN() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Total commission of sales employee : "+ this.commRate*this.grossSales);
	}
	
	
}
