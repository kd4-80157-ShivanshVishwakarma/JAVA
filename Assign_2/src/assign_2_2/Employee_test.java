package assign_2_2;

public class Employee_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Shiva","Vish",20000);
		System.out.println("Yearly Salary of Emp1 : "+emp1.yearlySal());
		
		Employee emp2=new Employee("Hari","pol",25000);
		System.out.println("Yearly Salary of Emp2 : "+emp2.yearlySal());
		System.out.println("Yearly Salary of Emp1 with 10% hike : "+emp1.yearlySal()*(1+0.1));
		System.out.println("Yearly Salary of Emp2 with 10% hike : "+emp2.yearlySal()*(1+0.1));
	}

}
