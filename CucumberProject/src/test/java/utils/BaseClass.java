package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void DriverSetup() {
		if(driver==null) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		}	
	}
	
	public static void CloseDriver() {
		if(driver!= null) {
			driver.quit();
			driver=null;
		}
		
	}

}
