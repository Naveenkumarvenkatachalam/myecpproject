package com.connex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CodeMaitain {
	
	@FindBy(xpath="//*[@class='wp-categories-link maxheight']/following::a[8]")
	public static WebElement xlinex;
	
	@FindBy(xpath="//*[@onclick='normalAlert()']")
	public static WebElement alalrt;
	
	@FindBy(xpath="//*[@onclick='confirmAlert()']")
	public static WebElement concon;
}
