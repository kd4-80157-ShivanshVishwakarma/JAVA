package com.sunbeam.stream;
//package com.sunbeam.stream;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Sstream {

	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer>s=Stream.generate(()-> r.nextInt(10))
				.limit(10);
		int res=s.reduce(0,(a,e)->a+e);
		System.out.println(res);
		
	}
}
//() <>+