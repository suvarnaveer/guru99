package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void guru99tutorials() {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.guru99.com/");
	String eTitle="Meet Guru99";
	String aTitle="";
	aTitle=driver.getTitle();
	if(aTitle.equalsIgnoreCase(eTitle)) {
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	driver.close();
}
}