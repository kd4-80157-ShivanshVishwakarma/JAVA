package com.app.fruit;

public class Apple extends FruitBasket {

	public Apple() {
		super("Apple");
	}
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Mango =" + getColor() + ", Weight =" + getWeight() + ", Name =" + getName()
				+ ", Fresh status =" + isFresh();
	}
	public String taste() {
		return ",taste = sweet n sour";
	}
	
}
