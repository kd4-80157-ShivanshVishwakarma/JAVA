package com.sunbeam.stream;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.util.List;

public class Sstream {

	public static void main(String[] args) {
		
		int result = Stream
				.iterate(1, i -> i + 1)
				.limit(6)
		        .reduce(1,(i,y)->i*y);
		System.out.println(result);
		

	}

}
