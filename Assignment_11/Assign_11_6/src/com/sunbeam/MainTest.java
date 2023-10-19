package com.sunbeam;
import java.util.Scanner;
import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Student> mp=new LinkedHashMap<>();
		Student s;
		int choice;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Books");
			System.out.println("2. Find a book");
			System.out.println("----------------");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				s=new Student();
				s.accept(sc);
				mp.put(s.getRollno(), s);
				break;
			case 2:
				System.out.println("Enter rollno to find student : ");
				int x = sc.nextInt();
				Student st = mp.get(x);//Returns value not key
				System.out.println("Information : "+st);
				break;
			default: System.out.println("Invalid input");
			break;
			}
		}while(choice!=0);
		
	}

}
