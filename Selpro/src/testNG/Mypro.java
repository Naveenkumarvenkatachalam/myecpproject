package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mypro {
	@Test
	public void pri()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
	     
		
	}

}
