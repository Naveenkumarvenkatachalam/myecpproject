package com.orangehrm;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orangehhexample {
	 WebDriver driver;
	 @BeforeMethod
        public void readfomproperty()
        {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Naveen\\Downloads\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	 @Test
	 public void Orrnhrm()
	 {
		 PageFactory.initElements(driver, Pagefacexample.class);
		 TakesScreenshot scrnshot=(TakesScreenshot) driver;
		 File fyfy= scrnshot.getScreenshotAs(OutputType.FILE);
		 File file = new File("D:\\ssaammple\\coolbab.png");
		 try {
			FileHandler.copy(fyfy, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Pagefacexample.usrusnm.sendKeys("Admin");
		 Pagefacexample.usrpss.sendKeys("admin123");
		 Pagefacexample.lgin.click();
		 TakesScreenshot scrnshott=(TakesScreenshot) driver;
		 File fyfye= scrnshot.getScreenshotAs(OutputType.FILE);
		 File filee = new File("D:\\ssaammple\\coolbaba.png");
		 try {
			FileHandler.copy(fyfye, filee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebDriverWait webwait = new WebDriverWait(driver, 4000);
		 WebElement dottoc= webwait.until(ExpectedConditions.elementToBeClickable(Pagefacexample.rctment));
		 dottoc.click();
	 }
			
}
