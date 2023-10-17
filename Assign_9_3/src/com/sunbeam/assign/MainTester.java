package com.sunbeam.assign;

import java.util.Arrays;
import java.util.Comparator;

public class MainTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArr arr[]=new StudentArr[4];
		arr[0]=new StudentArr(1002,"Rakesh","Indore",52.1);
		arr[1]=new StudentArr(1003,"Ashish","Jabalpur",90.5);
		arr[2]=new StudentArr(1002,"Rakesh","Indore",63.2);
		arr[3]=new StudentArr(1008,"Yogi","Jabapur",70.8);
//		arr[4]=new StudentArr(1004,"","Jhansi",80);
		
		class StudentComparator implements Comparator<StudentArr>{
			@Override
			public int compare(StudentArr s1, StudentArr s2) {
			    int diff=s1.getRoll()-s2.getRoll();
			    if(diff==0) {
			    	diff=s1.getName().compareTo(s2.getName());
				    	if(diff==0) {
					    	diff= - s1.getCity().compareTo(s2.getCity());
					    	if(diff==0) {
					    		diff= - Double.compare(s1.getMarks(),s2.getMarks());
					    	}
					    }
				    	
			    }
				return diff;
			}	
		}
		StudentComparator sArr=new StudentComparator();
		Arrays.sort(arr,sArr);
		for(StudentArr ele: arr) {
			System.out.println("Elements : "+ele);
		}
	}

}
