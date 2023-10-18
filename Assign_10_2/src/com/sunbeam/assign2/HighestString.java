package com.sunbeam.assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList= new ArrayList<>();
		sList.add("P");
		sList.add("X");
		sList.add("C");
		sList.add("H");
		sList.add("Y");
		
		class HighComparator implements Comparator<String>{
			@Override
			public int compare(String s1, String s2) {
				int diff=s1.length() - s2.length();
				return diff;
			}
		}
		HighComparator hg=new HighComparator();
		String s = Collections.max(sList,hg);
		System.out.println(s);
	}

}
