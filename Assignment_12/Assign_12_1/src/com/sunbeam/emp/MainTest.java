package com.sunbeam.emp;

interface Emp{
	double getSal();
	default double calcIncome() {
		return 0.0;
	}
	static double calcTotIncome(Emp arr[]) {
		double total=0;
		for(Emp e:arr) {
			total+=e.getSal();
		}
		return total;
	}
}
public class MainTest {

	public static void main(String[] args) {

		Emp arr[]=new Emp[3];
		arr[0]=new Manager(2,200);
		arr[1]=new Labor(2000,500);
		arr[2]=new Clerk(5000);
		double res=Emp.calcTotIncome(arr);
		System.out.println("Total Income : "+res);
	}

}
