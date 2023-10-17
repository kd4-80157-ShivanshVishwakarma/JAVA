package com.sunbeam.generic2;
import java.util.Scanner;

public class Person implements Displayable {
	
	private String name;
	private int age;
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.print("Enter the name : ");
		this.name=sc.next();
		System.out.print("Enter the age : ");
		this.age=sc.nextInt();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Name : "+ this.name);
		System.out.println("Age : "+this.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
