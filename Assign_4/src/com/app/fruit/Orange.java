package com.app.fruit;

public class Orange extends FruitBasket {

	public Orange() {
		super("Orange");
	}
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
		
	}
	public String taste() {
		return ", taste = sour";
	}
	@Override
	public String toString() {
		return "Orange =" + getColor() + ", Weight =" + getWeight() + ", Name =" + getName()
				+ ", Fresh status =" + isFresh();
	}
	
	
}
