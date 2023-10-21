package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List.*;
import java.util.Scanner;

public class Maintest {
	//write book
	public static void saveBook(ArrayList<StoreBook>lst) {
		try(FileOutputStream fout = new FileOutputStream("book.txt")) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for(StoreBook b : lst) {
					dout.writeUTF(b.getIsbn());
					dout.writeDouble(b.getPrice());
					dout.writeUTF(b.getAuthorName());
					dout.writeInt(b.getQuantity());
				}
			} 
		} 
		catch (Exception er) {
			er.printStackTrace();
			}
	}
	public static void loadBook() {
//		ArrayList<StoreBook> list= new ArrayList<>();
		try(FileInputStream fin = new FileInputStream("book.txt")) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					
					StoreBook b=new StoreBook();
					b.setIsbn(din.readUTF());
					b.setPrice(din.readDouble());
					b.setAuthorName(din.readUTF());
					b.setQuantity(din.readInt());
					System.out.println(b);
				}
				
			} 
		}
		catch (EOFException er) {
		}
		catch (Exception er) {
			er.printStackTrace();
		}
//		System.out.println(list);
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<StoreBook> list=new ArrayList<>();
		StoreBook b1;
		int indx=0;
		int choice;
		do {
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order using random access.");
			System.out.println("3. Check if book with given isbn is in list or not by index");
			System.out.println("4. Delete a book at given index ");
			System.out.println("5. Delete a books with isbn");
			System.out.println("6. Reverse the list");//Using collections
			System.out.println("7. Save Books");
			System.out.println("8. Loads Books");
			System.out.println("----------------------------------------------------------");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				b1=new StoreBook();
				b1.accept();
				if(list.contains(b1)) {
					indx=list.indexOf(b1);
					StoreBook b=list.get(indx);
					b.setQuantity(b.getQuantity()+1);
				}
				else {
					list.add(b1);
				}
				break;
			case 2:
//				Iterator<StoreBook> itr=list.iterator();
//				while(itr.hasNext()) {
//					StoreBook ob=itr.next();
//					System.out.println(ob);
//				}
				for(int i=0;i<list.size();++i) {
					b1=list.get(i);
					System.out.println(b1);
				}
				break;
			case 3:
				System.out.println("Enter isbn to check if book is present : ");
				String isbn=sc.next();
				StoreBook b=new StoreBook();
				b.setIsbn(isbn);
				if(list.contains(b))
					System.out.println("Found");
				else {System.out.println("Not Found");}
				break;
			case 4:
				System.out.println("Enter index to remove book");
				int x=sc.nextInt();
				if(x<=list.size()) {
					list.remove(x);
				}else {System.out.println("Index exceeded");}
				break;
			case 5:
				System.out.println("Enter isbn to delete book");
				String s=sc.next();
				StoreBook bk=new StoreBook();
				bk.setIsbn(s);
				if(list.contains(bk)) {
					int ind = list.indexOf(bk);
					list.remove(ind);
				}
				break;
			case 6:
				/*ListIterator<StoreBook> itr2=list.listIterator(list.size());
				while(itr2.hasPrevious()) {
					StoreBook bp=itr2.previous();
					System.out.println(bp);
				}*/
				Collections.reverse(list);
				break;
			case 7:
				saveBook(list);
				System.out.println("Books are saved");
				break;
			case 8:
				loadBook();
				
				break;
				
			default:System.out.println("Invalid choice");
			break;
			}
		}while(choice!=0);
	}

}

