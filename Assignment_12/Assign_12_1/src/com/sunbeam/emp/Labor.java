package com.sunbeam.emp;

public class Labor implements Emp{
	
	public double hrs,rate;

	public Labor(double hrs, double rate) {
		this.hrs = hrs;
		this.rate = rate;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public double getSal() {
		
		return this.hrs*this.rate;
	}
	public double calcIncome() {
		if(this.hrs>300) {
			return 0.05*this.getSal();
		}
		return 0.0;
	}
	
}
