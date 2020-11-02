package com.connex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Sample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String loc ="F:\\read and write\\myfol\\kum.txt";
		String content = "naveen@gmail.com";
		try {
		FileReader read = new FileReader(loc);
		BufferedReader buff = new BufferedReader(read);
		String str=buff.readLine();
		System.out.println(str);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not saved");
		}
	}

}
