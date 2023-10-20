package com.sunbeam.lamda;

@FunctionalInterface
interface Check<T>{
	boolean compare(T x, T y);
}

public class Lamda {
	
	public static <T>int countIf(T arr[],T key,Check<T>c){
		int cnt=0;
		for(T ele:arr) {
			if(c.compare(ele, key)) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		System.out.println("Count of ele greater than key : "+countIf(arr,key,(x,y)->x>y));
	}

}
