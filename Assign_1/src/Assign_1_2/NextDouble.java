package Assign_1_2;
import java.util.Scanner;

public class NextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d1=0,d2=0;
		if(sc.hasNextInt())
			System.out.println("Not a double value");
		else {
//			System.out.println("Enter double valule d1 : ");
			d1 = sc.nextDouble();
		}
	
		if(sc.hasNextInt())
			System.out.println("Not a double value");
		else {
//			System.out.println("Enter double valule d2 : ");
			d2 = sc.nextDouble();
		}
		System.out.println((d1+d2)/2);
	}

}
