package com.orangehrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagefacexample {
	@FindBy(xpath="//input[@name='txtUsername']")
	public static WebElement usrusnm;
	@FindBy(xpath="//input[@name='txtPassword']")
	public static WebElement usrpss;
	@FindBy(xpath="//input[@name='Submit']")
	public static WebElement lgin;
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']")
	public static WebElement rctment;
}
