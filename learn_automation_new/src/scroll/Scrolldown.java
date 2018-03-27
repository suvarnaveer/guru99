package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown {
	@Test
	public void Scrollpagedown() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://jqueryui.com/");
	 Thread.sleep(6000);
	 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
}
}