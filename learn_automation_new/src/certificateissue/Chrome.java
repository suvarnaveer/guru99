package certificateissue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Chrome {
	

	
	@Test
	public void handlecertificate() {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver(cap);
		
		 driver.get("http://www.cacert.org/");
	}

}
