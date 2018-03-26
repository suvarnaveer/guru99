package datadrivernTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	@Test(dataProvider="wordpress")
	public void Wordpresslogin(String username ,String password) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://login.wordpress.org/wp-login.php");
		 driver.findElement(By.id("user_login")).sendKeys(username);
		 driver.findElement(By.id("user_pass")).sendKeys(password);
		 driver.findElement(By.id("wp-submit")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.getTitle());
		 System.out.println("Quitting the driver");
		 driver.quit();
		 
	}
	@DataProvider(name="wordpress")
	public Object[][] passData(){
		
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0]="admin2";
		data[2][1]="demo1234";
		
		return data;
	}

}
