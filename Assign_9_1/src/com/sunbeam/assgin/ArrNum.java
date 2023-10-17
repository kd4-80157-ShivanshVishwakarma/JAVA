package com.sunbeam.assgin;

public class ArrNum {
	
	static <T extends Number> T findMin(T[] arr) {
		T mini=arr[0];
		for(T ele:arr) {
			if(mini.doubleValue()>ele.doubleValue()) {
				mini=ele;
			}
		}
		return mini;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Minimum of double : "+min2);
	}

}
