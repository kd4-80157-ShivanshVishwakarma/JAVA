package com.sunbeam.assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		List<Employee> empList= new LinkedList<>();
//		Employee e1=new Employee("Ritik",1001,50000,26);
//		Employee e2=new Employee("Yuvraj",1005,60000,27);
//		Employee e3=new Employee("Jack",1007,70000,27);
//		Employee e4=new Employee("Pratik",1006,90000,25);
//		Employee e5=new Employee("Rahul",1002,30000,29);
		Scanner sc=new Scanner(System.in);
		
//		Collections.addAll(emp,e1,e2,e3,e4,e5);
//		System.out.println(emp.toString());
		
		int choice;
		Employee e;
		//add delete find sort edit
		do {
			System.out.println("1. Add a new employee.");
			System.out.println("2. Delete an Employee by id.");
			System.out.println("3. Find an employee by id");
			System.out.println("4. Sort employee in backward and forward order.");
			System.out.println("5. Edit information of an employee.");
			System.out.println("6. Display all employees.");
			System.out.println("----------------------------------------------------------");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				e=new Employee();
				e.accept();
				empList.add(e);
				break;
			case 2:
				System.out.println("Enter the id of an employee : ");
				int x=sc.nextInt();
				e=new Employee();
				e.setId(x);
				if(empList.contains(e)) {
					int id=empList.indexOf(e);
					empList.remove(id);
					System.out.println("Employee data has been deleted");
				}
				else {System.out.println("Employee id doesn't exist.");}
				break;
			case 3:
				System.out.println("Enter the id to find Employee : ");
				int i=sc.nextInt();
				e=new Employee();
				e.setId(i);
				if(empList.contains(e)) {
					System.out.println("Employee Found");
				}
				else {System.out.println("Employee not found");}
				break;
			case 4:
				class EmpComparator implements Comparator<Employee>{

					@Override
					public int compare(Employee e1, Employee e2) {
						int diff=e1.compareTo(e2);
						return diff;
					}
				}
				empList.sort(new EmpComparator());
				for(Employee ee:empList) {
					System.out.println(ee);
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				e= new Employee();
				e.setId(id);
				int ind = empList.indexOf(e);
				Employee oldEmp=new Employee();
				oldEmp=empList.get(ind);
				System.out.println("Employee info before modification \n"+oldEmp);
				Employee newEmp=new Employee();
				System.out.println("Employee new info of Employee : ");
				newEmp.accept();
				empList.add(ind,newEmp);
				System.out.println("Employee info after modification \n"+newEmp);
			case 6:
				for(Employee ee:empList) {
					System.out.println(ee.toString());
				}
				break;
			default:System.out.println("Invalid input");
			break;
			}
		}while(choice!=0);
	}

}
