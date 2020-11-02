package com.connex;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exampleproprpo {
	@Test
	public void  getfromxcelsheet() throws BiffException, IOException
	{
	FileInputStream loca = new FileInputStream("C:\\Users\\Naveen\\Documents\\transferjava.xls");	
	Workbook bookbr =Workbook.getWorkbook(loca);
	Sheet seat=bookbr.getSheet(0);
	int roo=seat.getRows();
	int colm=seat.getColumns();
	String gebook[][]=new String[roo-1][colm];
	for(int i=1;i<roo;i++) {
		for(int j=;j<colm;j++) {
		 gebook[i-1][j-5]=seat.getCell(j, i).getContents();
		}
	}
	System.out.println(gebook);
	}
}
