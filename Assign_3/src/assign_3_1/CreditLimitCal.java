package assign_3_1;
import java.util.Scanner;

public class CreditLimitCal {

		// TODO Auto-generated method stub
		private int accoutnNum;
		private double balance;
//		private String month;
		private int CredLimit=20000;
		private double charges;
		
//		public CreditLimitCal(int accoutnNum, double balance, String string, int credLimit, double charges) {
//			this.accoutnNum = accoutnNum;
//			this.balance = balance;
//			this.month = string;
//			CredLimit = credLimit;
//			this.charges = charges;
//		}
		public int getAccoutnNum() {
			return accoutnNum;
		}
		public void setAccoutnNum(int accoutnNum) {
			this.accoutnNum = accoutnNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
//		public int getMonth() {
//			return month;
//		}
//		public void setMonth(int month) {
//			this.month = month;
//		}
//		public int getCredLimit() {
//			return CredLimit;
//		}
//		public void setCredLimit(int credLimit) {
//			CredLimit = credLimit;
//		}
		public void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Account no. : ");
			this.accoutnNum=sc.nextInt();
			
			System.out.println("Enter the expense : ");
			this.charges=sc.nextDouble();
			
			
		}
		public void checkLimit() {
		    int temp=(int) (balance+charges-CredLimit);
		    if(temp>this.CredLimit) {
		    	System.out.println("Credit Limit Exceeded");
		    }
		    else {
		    	System.out.println("Credit Limit is safe");
		    	this.balance=temp;
		    }
		}
		
		
		

}
