package com.sunbeam.generic2;

class Box<T>{
	private T obj;
	
	public void set(T obj) {
		this.obj=obj;
	}
	public T get() {
		return obj;
	}
}

public class Main {
	
	public static void showBox(Box<? extends Displayable>b) {
//		System.out.println("");
		b.get().show();
	}
	public static void printBox(Box<?>b) {
//		System.out.println("");
		b.get().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.accept();
		Box<Person>p=new Box<>();
		p.set(p1);
	    Date d1=new Date(1,1,2024);
	    Box<Date>d=new Box<>();
	    d.set(d1);
	    showBox(p);
	    showBox(d);
	    printBox(d);
	    printBox(p);
	    
//	    d1.accept();
	    
	}

}
