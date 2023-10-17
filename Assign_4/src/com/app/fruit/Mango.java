package com.app.fruit;

public class Mango extends FruitBasket {

	public Mango() {
		super("Mango");
	}
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
	public String taste() {
		return ", taste = sweet";
	}
	@Override
	public String toString() {
		return "Mango =" + getColor() + ", Weight =" + getWeight() + ", Name =" + getName()
				+ ", Fresh status =" + isFresh();
	}
}
