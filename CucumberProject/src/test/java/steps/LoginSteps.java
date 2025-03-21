package steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.Login;
import utils.BaseClass;

public class LoginSteps {
	
	public WebDriver driver;
	public Login lgn;
	
	@Given("User launches the Chrome Browser")
	public void userLaunchesTheChromeBrowser() {
	    driver=BaseClass.driver;
		lgn=new Login(driver);
	}
	
	@And("User enter the Username as {string}")
	public void userEnterTheUsernameAs(String uname) {
	    lgn.setUsrname(uname);

	}
	@And("User enter the password as {string}")
	public void userEnterThePasswordAs(String pass) {
	    lgn.setpswrd(pass);

	}
	@When("User clicks on the Login button")
	public void userClicksOnTheLoginButton() {
	    lgn.clickloginbtn();

	}
	@Then("page title should be {string}")
	public void pageTitleShouldBe(String Pagetitle) {
	   String title= lgn.CheckTitle();
	   System.out.println(title);
	    if(title.equals(Pagetitle)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }

	}

}
