package com.sunbeam.generic2;
import java.util.Scanner;

public class Date implements Displayable{

	private int day;
	private int month;
	private int year;
	Scanner sc=new Scanner(System.in);
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void accept() {
		System.out.print("Enter the day : ");
		this.day=sc.nextInt();
		System.out.print("Enter the month : ");
		this.month=sc.nextInt();
		System.out.print("Enter the year : ");
		this.year=sc.nextInt();
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
