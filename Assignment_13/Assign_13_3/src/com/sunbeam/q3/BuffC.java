package com.sunbeam.q3;
import java.io.BufferedWriter;
import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class BuffC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(FileWriter fwt = new FileWriter("FOA.bin")){
			try(BufferedWriter bwt = new BufferedWriter(fwt)){
				for(int i=1; i<=4; i++) {
					System.out.println("enter input - ");
					String line = sc.nextLine();
					bwt.write(line);
					bwt.newLine();
				}
			}
		}
		catch (Exception er) {
			er.printStackTrace();
		}
		System.out.println("file saved");
	}

}
