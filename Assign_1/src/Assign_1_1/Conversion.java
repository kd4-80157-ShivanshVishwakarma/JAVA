package Assign_1_1;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input : ");
		int num1=sc.nextInt();
		
		System.out.println("Convert to Binary : "+Integer.toBinaryString(num1));
		System.out.println("Convert to Octal : "+Integer.toOctalString(num1));
		System.out.println("Convert to Hex : "+Integer.toHexString(num1));
		sc.close();
	}

}
