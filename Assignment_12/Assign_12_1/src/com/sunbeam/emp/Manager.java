package com.sunbeam.emp;

public class Manager implements Emp{
	
	private double da,bs;
	
	public Manager(double bs, double da) {
		this.da = da;
		this.bs = bs;
	}	
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getBs() {
		return bs;
	}

	public void setBs(double bs) {
		this.bs = bs;
	}
	@Override
	public double getSal() {
		return (this.bs+this.da);
	}
	public double calcIncome() {
		return 0.2*bs;
	}
	
	
}
