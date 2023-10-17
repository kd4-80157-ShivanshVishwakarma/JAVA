package com.sunbeam.assign4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<StoreBooks> list=new ArrayList<>();
		StoreBooks b1;
		int choice;
		do {
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete at book given index ");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order -- list.sort();");
			System.out.println("----------------------------------------------------------");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				b1=new StoreBooks();
				b1.accept();
				list.add(b1);
				break;
			case 2:
				for(StoreBooks sb:list) {
//					sb.toString();
					System.out.println(sb);
				}
				break;
			case 3:
				System.out.println("Enter index to remove book");
				int x=sc.nextInt();
				list.remove(x);
				break;
			case 4:
				System.out.println("Enter isbn to check if book is present : ");
				String isbn=sc.next();
				StoreBooks b=new StoreBooks();
				b.setIsbn(isbn);
				if(list.contains(b))
					System.out.println("Found");
				else {System.out.println("Not Found");}
				break;
			case 5:
				list.clear();
				System.out.println("All books are deleted");
				break;
			case 6:
				System.out.println("Number of books : "+list.size());
				break;
			case 7:
				class BookComparator implements Comparator<StoreBooks>{		@Override
					public int compare(StoreBooks s1, StoreBooks s2) {
						int diff= - Double.compare(s1.getPrice(),s2.getPrice());
						return diff;
					}
				}
				BookComparator bk =new BookComparator();
				list.sort(bk);
				for(StoreBooks sb:list) {
					System.out.println(sb.toString());
				}
				break;
			default:System.out.println("Invalid choice");
			break;
			}
		}while(choice!=0);
	}

}