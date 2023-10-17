package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	private Scanner sc=new Scanner(System.in);
	
	public FruitBasket(String color, double weight, String name, boolean isFresh) {
//		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public FruitBasket(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public void accept(){
		System.out.println("Enter color of fruit : ");
		this.color=sc.next();
		
		System.out.println("Enter weight fruit : ");
		this.weight=sc.nextDouble();
		
//		System.out.println("Enter name of fruit : ");
//		this.color=sc.next();
		
//		System.out.println("Is the fruit fresh : ");
//		System.out.println("If yes, Enter 1 : ");
//		System.out.println("For no, Enter 0  : ");
//		this.isFresh=sc.nextBoolean();
		
	}
	@Override
	public String toString() {
		return ""+this.name+","+""+this.color+","+""+this.weight+","+""+this.isFresh+"";
	}
	
	public String taste() {
		return "No specific taste";
	}

}
