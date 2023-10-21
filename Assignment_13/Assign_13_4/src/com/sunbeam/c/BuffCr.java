package com.sunbeam.c;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class BuffCr {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		try(FileReader frt = new FileReader("../Assign_13_3/FOA.bin")){
			try(BufferedReader brt = new BufferedReader(frt)){
				String line;
				while((line = brt.readLine())!=null) {
					 System.out.println(line);
				}
			}
		}
		catch (Exception er) {
			er.printStackTrace();
		}

	}

}
