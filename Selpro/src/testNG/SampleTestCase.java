package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTestCase {
	WebDriver driver;
	long starttime;
	long endtime;
	@BeforeSuite
	public void google()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	
	@Test
	public void opengoogle()
	{
	driver.get("http://www.google.com");
    }
	@Test(enabled = false)
	public void bing()
	{
	driver.get("http://www.bing.com");
    }
	
	@AfterSuite
	public void endgame()
	{
		 endtime=System.currentTimeMillis();
	     long total=starttime-endtime;
	     System.out.println(total);
	     
	     
	}

}
