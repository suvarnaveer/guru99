package radioandcheckbox;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		 List<WebElement> radio=driver.findElements(By.xpath("//input[@name ='lang' and @type='radio']"));
		 for(int i=0;i<radio.size();i++) {
			WebElement local_radio= radio.get(i);
			String value=local_radio.getAttribute("value");
			System.out.println("Values of radio buttons are:"+value);
			 if(value.equalsIgnoreCase("RUBY")) {
				 local_radio.click();
				 
			 }
			 
		 }
		 
	}

}
