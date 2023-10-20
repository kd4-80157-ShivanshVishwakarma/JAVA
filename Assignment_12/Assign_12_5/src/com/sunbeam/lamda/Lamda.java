package com.sunbeam.lamda;
import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface Check<T>{
	boolean compare(T x, T y);
}

public class Lamda {
	public static <T>int countIf(T arr[],T key,Check<T>c){
		int cnt=0;
		for(T ele:arr) {
			if(c.compare(ele,key)) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double [] arr = {1.1,1.3,2.9,3.5,3.2,1.3};
		System.out.print("Enter key : ");
		Double key=sc.nextDouble();
		int c=countIf(arr,key,(x,y)->x.equals(key));
		System.out.println("Occurence of key : "+c);
	}

}
