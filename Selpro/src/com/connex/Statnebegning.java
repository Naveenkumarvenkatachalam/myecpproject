package com.connex;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Statnebegning {
	String data[][]=null;
	@DataProvider(name="boss")
	public String[][] setedata() throws BiffException, IOException
	{
		data= getfromxcelsheet();
		return data;
	}
	public String[][] getfromxcelsheet() throws BiffException, IOException
	{
	FileInputStream loca = new FileInputStream("C:\\Users\\Naveen\\Documents\\transferjava.xls");	
	Workbook bookbr =Workbook.getWorkbook(loca);
	Sheet seat=bookbr.getSheet(0);
	int roo=seat.getRows();
	int colm=seat.getColumns();
	String gebook[][]=new String[roo-1][colm-5];
	for(int i=1;i<roo;i++) {
		for(int j=5;j<colm;j++) {
		 gebook[i-1][j-5]=seat.getCell(j, i).getContents();
		}
	}
	return gebook;
	}
   @Test(dataProvider="boss")
	public void accura(String username,String pasword)
	{
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Naveen\\Downloads\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement txtbx= driver.findElement(By.id("txtUsername"));
		txtbx.sendKeys(username);
		WebElement txxpass=driver.findElement(By.id("txtPassword"));
		txxpass.sendKeys(pasword);
		WebElement loglog=driver.findElement(By.id("btnLogin"));
		loglog.click();
		driver.quit();
	}
}