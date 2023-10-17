package assign_2_2;
//import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double monthSalary;
	
	public Employee(String firstName, String lastName, double monthSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthSalary>0) {
			this.monthSalary=monthSalary;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return this.monthSalary;
	}

	public void setSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	public double yearlySal() {
	    return (this.monthSalary*12);
	}

}
