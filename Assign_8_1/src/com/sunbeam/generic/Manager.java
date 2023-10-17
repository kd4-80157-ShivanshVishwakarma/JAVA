package com.sunbeam.generic;


import java.util.Scanner;

class Manager extends Employee{
	
	private double bonus;
	private double totSal;
	
	Scanner sc=new Scanner(System.in);
	
//	public Manager(int id, double salary, double bonus) {
//		super(id, salary);
//		this.bonus = bonus;
//	}

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void accept() {
		super.accept();
		System.out.println("Enter the bonus : ");
		this.bonus=sc.nextDouble();
	}

	@Override
	double totalSal() {
		// TODO Auto-generated method stub
		return (this.bonus+this.getSalary());
		
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", totalSal=" + totalSal() + ", getId()=" + getId() + ", getSalary()="
				+ getSalary() + "]";
	}
	
	
	
}