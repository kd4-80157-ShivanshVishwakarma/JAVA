package com.sunbeam.generic;


import java.util.Scanner;

class Salesman extends Employee{
	
	private double comm;
	
	Scanner sc=new Scanner(System.in);
	
//	public Salesman(int id, double salary, double comm) {
//		super(id, salary);
//		this.comm = comm;
//	}

	public double getComm() {
		return comm;
	}
	
	public void setComm(double comm) {
		this.comm = comm;
	}
	
	public void accept() {
		super.accept();
		System.out.println("Enter the commission : ");
		this.comm=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Salesman [comm=" + comm + ", getTotSal()=" + totalSal() + ", getId()=" + getId() + ", getSalary()="
				+ getSalary() + "]";
	}

	@Override
	double totalSal() {
		// TODO Auto-generated method stub
		return comm*this.getSalary();
	}

	
	
	
}