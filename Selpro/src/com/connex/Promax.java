package com.connex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promax {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream inp = new FileInputStream("config.properties");
		Properties pro = new Properties();
		pro.load(inp);
	    String str=pro.getProperty("browser");
	    if(str.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	    }
	    else
	    {
	    	System.out.println("invalid give valid browser");
	    }
	    
	    driver.get("https://en.wikipedia.org/wiki/Namakkal_Anjaneyar_Temple");
     }

}
