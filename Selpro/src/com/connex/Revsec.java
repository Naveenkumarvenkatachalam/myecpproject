package com.connex;

import java.awt.Frame;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.CDATASection;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Revsec {
static WebDriver driver;

@Test
public static void  open() throws IOException {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();	
	 driver.get("http://www.leafground.com/");
     PageFactory.initElements(driver,CodeMaitain.class);
     CodeMaitain.xlinex.click();
     CodeMaitain.alalrt.click();
     Alert alert=driver.switchTo().alert();
     alert.accept();
     driver.switchTo().defaultContent();
     CodeMaitain.concon.click();
     Alert alert1=driver.switchTo().alert();
     alert1.accept();
}

}
