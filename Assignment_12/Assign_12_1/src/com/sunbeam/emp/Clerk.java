package com.sunbeam.emp;

public class Clerk implements Emp {
	private double sal;

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Clerk(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}
	
}
