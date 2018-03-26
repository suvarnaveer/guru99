package datadrivernTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;

public class WordpressLoginExcel {
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
		 driver.quit();
		 
	}
	@DataProvider(name="wordpress") 	     
	public Object[][] passData(){
		ExcelDataConfig config=new ExcelDataConfig("\"C:\\Users\\Pankaj\\eclipse-workspace\\learn_automation_new\\TestData\\InputData.xlsx\"");
		int rows=config.getrowcount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			data[i][0]=config.getData(0, i, 0);
			data[i][0]=config.getData(0, i, 1);
		}
		
		return data;
	}

}
