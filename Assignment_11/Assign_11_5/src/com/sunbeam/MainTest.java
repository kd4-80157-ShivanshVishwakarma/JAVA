package com.sunbeam;
import java.util.Scanner;
import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
	    Map<String,StoreBook> mp=new HashMap<>();
	    Scanner sc=new Scanner(System.in);
//		st.add(new StoreBook("4545",400,"B",5));
//		st.add(new StoreBook("2575",500,"C",2));
//		st.add(new StoreBook("4545",600,"K",3));
//		st.add(new StoreBook("4545",200,"I",4));
//		st.add(new StoreBook("1545",400,"P",5));
//		st.add(new StoreBook("6545",300,"O",7));
		
		StoreBook b;
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Books");
			System.out.println("2. Find a book");
			System.out.println("----------------");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				b=new StoreBook();
				b.accept();
				mp.put(b.getIsbn(), b);
				break;
			case 2:
				/*System.out.println("Enter isbn to find : ");
				String s=sc.next();
				if(mp.containsKey(s)) {
					System.out.println("Found");
					StoreBook ss=new StoreBook();
					ss.setIsbn(s);
				}
				System.out.println("Not Found");*/
				System.out.println("Enter isbn to find : ");
				String s=sc.next();
				StoreBook ss=new StoreBook();
				ss=mp.get(s);
				if(ss!=null) {
					System.out.println("Found book");
				}
				System.out.println("Not Found");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
	}while(choice!=0);

}
}



