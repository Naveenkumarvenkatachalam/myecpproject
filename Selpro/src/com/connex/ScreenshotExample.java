package com.connex;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Button.html");
		/*
		 * TakesScreenshot scrnshot = (TakesScreenshot) driver; File frompoint=
		 * scrnshot.getScreenshotAs(OutputType.FILE); File topoint = new
		 * File("scrn.png"); org.openqa.selenium.io.FileHandler.copy(frompoint,
		 * topoint);
		 */
        Robot robot = new Robot();
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
       Rectangle rec = new Rectangle(dim);
       BufferedImage buf=robot.createScreenCapture(rec);
       File fil = new File("pic.png");
       ImageIO.write(buf, "png", fil);
	}

}
