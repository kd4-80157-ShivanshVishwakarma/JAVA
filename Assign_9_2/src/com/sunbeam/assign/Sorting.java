package com.sunbeam.assign;

import java.util.Comparator;

public class Sorting {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		   for(int j=i+1; j<arr.length; j++) {
		      if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
		       }
		   }
		}
	}
	
	public static void main(String args[]) {
		Double arr[]= {2.2,8.4,5.7,9.6};
		
		class DoubleComparator implements Comparator<Double> {
			@Override
			public int compare(Double d1,Double d2) {
				int diff = Double.compare(d1,d2);
				return diff;
			}
		}
		DoubleComparator c1=new DoubleComparator();
		Sorting.<Double>selectionSort(arr,c1);
		for(Double d:arr) {
			System.out.println("Elements : "+d);
		}
	}
}
