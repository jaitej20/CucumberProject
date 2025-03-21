package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.*;
import pageObject.Login;
import steps.AddtoCart;
import utils.BaseClass;

public class MyHooks {
	
	public Login login;
	public AddtoCart Add;
	
	@Before
	public void setup(Scenario scenario) {
		BaseClass.DriverSetup();
		BaseClass.driver.get("https://www.saucedemo.com/");
	}
	
	@Before("@CartCheckout")
	public void productinCart(Scenario scenario) {
		
		//for login before CartCheckOut
		 login = new Login(BaseClass.driver);
		 login.setUsrname("standard_user");
	     login.setpswrd("secret_sauce");
	     login.clickloginbtn();
	     
	     //for Adding Product to cart before Checkout
	     login.AddtoCart();
	     login.ClickonCart();    
	}
	
	
	@After
	public void teardown(Scenario scenario) {
		Boolean failed=scenario.isFailed();
		if(failed) {
			byte[] screenshot= ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test Screenshot");
		}
		
		BaseClass.CloseDriver();
	}

}
