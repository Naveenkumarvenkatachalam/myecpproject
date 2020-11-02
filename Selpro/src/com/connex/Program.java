package com.connex;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lloogg.Refmetho;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Program {

	public static void main(String[] args) throws AWTException, InterruptedException, BiffException, IOException {
		
		  // TODO Auto-generated method stub
		  
		  FileInputStream fin = new FileInputStream("C:\\Users\\Naveen\\Documents\\transferjava.xls"); 
		  Workbook booksw = Workbook.getWorkbook(fin); 
		  Sheet sheatcel=booksw.getSheet(0); 
		  int colomncount=sheatcel.getColumns(); 
		  int rowcount=sheatcel.getRows(); 
		  String finalout= "";
		  for(int i=1;i<rowcount;i++) 
		  { 
			  for(int j=5;j<colomncount;j++) 
			  {
		      finalout=sheatcel.getCell(j, i).getContents(); 
		      System.out.println(finalout);
		  } 
		  }
			  System.out.println();
			  
		  
		 

	}
}
