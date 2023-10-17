package com.app.fruit;
import java.util.Scanner;
public class FruitBasketTest {

	public static int menu() {
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits");
		System.out.println("5. Display name,color,weight,taste of all fresh fruit");
		System.out.println("6. Display taste of all stale fruits");
		System.out.println("7. Mark a fruit as stale");
//		System.out.println("8. Display names of all fruits");
		System.out.println("Enter your choice : ");
		int choice=new Scanner(System.in).nextInt();
		return choice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket size : ");
		int num=sc.nextInt();
		FruitBasket Ft[]=new FruitBasket[num];
		int choice;
		int ind=0;
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				if(ind<=num) {
					System.out.println("Add Mangoes");
					Ft[ind]=new Mango();
					Ft[ind].setFresh(true);
					Ft[ind++].accept();
				}
				else {
					System.out.println("Basket is full");
				}
				break;
			case 2:
				if(ind<=num) {
					System.out.println("Add Oranges");
					Ft[ind]=new Orange();
					Ft[ind].setFresh(false);
					Ft[ind++].accept();
				}
				else {
					System.out.println("Basket is full");
				}
				break;
			case 3:
				if(ind<=num) {
					System.out.println("Add Apple");
					Ft[ind]=new Apple();
					Ft[ind++].accept();
				}
				else {
					System.out.println("Basket is full");
				}
				break;
			case 4:
				for(FruitBasket ft:Ft) {
					if(ft!=null) {
						System.out.println(ft.getName());
					}
					
				}
				break;
			case 5:
				for(FruitBasket ft:Ft) {
					if(ft!=null) {
						System.out.print(ft.toString()+" ");
						System.out.println(ft.taste());
						if(ft.isFresh()) {
							System.out.println("Fresh fruit");
						}
					}
				}
				break;
			case 6:
				for(FruitBasket ft:Ft) {
					if(!(ft.isFresh())) {
						
						System.out.println("Stale fruit and "+ft.taste());
					}
				}
				break;
			case 7: 
				System.out.print("Enter the index : ");
				int idx=new Scanner(System.in).nextInt();
				boolean flag=false;
				for(int i=0;i<num;++i) {
					if(i==idx) {
						Ft[i].setFresh(false);
						flag=true;
						break;
					}
				}if(flag==false) {
					System.out.println("Invalid Index");
				}
				break;
			default:
				System.out.println("Invalid input");break;
			}	
		}
		sc.close();
	}
	
}
