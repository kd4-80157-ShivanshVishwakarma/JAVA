package com.sunbeam.generic;

class Box<T extends Employee>{
	
	private T obj;
	
	public void set(T obj) {
		this.obj=obj;
	}
	public T get() {
		return obj;
	}
	
	public double getTotalSal() {
		return obj.totalSal();
	}
	public String display() {
		return obj.toString();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Manager();
		e1.accept();
		Box<Manager> b0=new Box<>();
		b0.set(new Manager());
		System.out.println(b0.getTotalSal());
		Manager m1=new Manager();
		m1.accept();
		Box<Manager> b1=new Box<>();
		b1.set(m1);
		System.out.println("Display the information : "+(b1.display()));
		Salesman s1=new Salesman();
		s1.accept();
		Box<Salesman> b2=new Box<>();
		b2.set(s1);
		System.out.println("Display the information : "+(b2.display()));
		System.out.println("Total Salary of Employees : "+(b1.getTotalSal()+b2.getTotalSal()));
	}

}
