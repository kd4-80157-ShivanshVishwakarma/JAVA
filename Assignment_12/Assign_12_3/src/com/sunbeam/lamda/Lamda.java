package com.sunbeam.lamda;
import java.util.*;
import java.util.function.*;

interface Arithmetic{
	double calc(double d1,double d2);
}

public class Lamda {
	
	public static void calculate(double d1,double d2,Arithmetic op) {
		double res=op.calc(d1, d2);
		System.out.println("Value of this : "+res);
	}
	
	public static void main(String[] args) {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		double d1=5.2;
		double d2=2.6;
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("----------------------");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				calculate(d1,d2,(t,u) -> t + u );
				break;
			case 2:
				calculate(d1,d2,(t,u) -> t - u );
				break;
			case 3:
				calculate(d1,d2,(t,u) -> t * u );
				break;
			case 4:
				calculate(d1,d2,(t,u) -> t / u );
				break;
			default:
				System.out.println("Invalid input");
			}
		}while(choice!=0);
	
	}
}
