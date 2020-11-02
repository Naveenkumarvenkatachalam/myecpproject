package com.connex;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeMap;

import net.bytebuddy.matcher.HasSuperTypeMatcher;

public class coreJava {
	public static void main(String[] args)  {
		String location ="C:\\Users\\Naveen\\Desktop\\betaver.txt";
		
		try {
			FileReader read = new FileReader(location);
		    BufferedReader bufread= new BufferedReader(read);
		String current;
		while((current=bufread.readLine())!=null)
		{
			System.out.println("file readed");
			FileWriter write = new FileWriter("C:\\Users\\Naveen\\Desktop\\alpha.txt");
			write.write(current);
			write.close();
		}
		}
		 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("file not found");
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("input,output problem");
		}
		}
}
