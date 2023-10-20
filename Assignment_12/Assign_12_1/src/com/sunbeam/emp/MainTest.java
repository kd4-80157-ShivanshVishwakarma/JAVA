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
		arr[0]=new Manager(50000,6000);
		arr[1]=new Labor(60000,7500);
		arr[2]=new Clerk(70000);
		double res=Emp.calcTotIncome(arr);
		System.out.println("Total Income : "+res);
	}

}
