package com.sunbeam;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp=new SalariedEmp();
//		emp.acceptData();
//		emp.calculateSalary();
		
//		Employee emp=new CommissionEmp();
//		emp.acceptData();
//		emp.calculateSalary();
		
		Employee emp=new BaseSalEmp();
		emp.acceptData();
		emp.calculateSalary();
	}

}
