package com.sunbeam;
import java.util.Scanner;


public class BaseSalEmp extends CommissionEmp {
	private double baseSal;
	Scanner sc=new Scanner(System.in);
	
	public BaseSalEmp() {
    	
    }
	
	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	public void acceptData() {
	     super.acceptData();
	     System.out.println("Enter the base salary : ");
	     this.baseSal=sc.nextDouble();
	}
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Total salary of salaried-commission employee : "+ (this.getBaseSal()+(this.getCommRate()*this.getGrossSales())));
	}
	
}
