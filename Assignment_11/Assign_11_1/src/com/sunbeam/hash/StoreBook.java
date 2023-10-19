package com.sunbeam.hash;

import java.util.Objects;
import java.util.Scanner;

public class StoreBook implements Comparable<StoreBook> {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	Scanner sc = new Scanner(System.in);

	public StoreBook() {

	}

	public StoreBook(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void addQuant() {
		this.quantity+=1;
	}
	public void accept() {
		System.out.println("Enter the isbn of book : ");
		this.isbn = sc.next();

		System.out.println("Enter the price of book : ");
		this.price = sc.nextDouble();

		System.out.println("Enter Author name : ");
		this.authorName = sc.next();

		System.out.println("Enter the quantity : ");
		this.quantity = sc.nextInt();
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(this.isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof StoreBook) {
			StoreBook other = (StoreBook) obj;
			if (other.getIsbn().equals(this.getIsbn())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "StoreBooks [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compareTo(StoreBook other) {
		int diff = this.getIsbn().compareTo(other.getIsbn());
		return diff;
	}

}
