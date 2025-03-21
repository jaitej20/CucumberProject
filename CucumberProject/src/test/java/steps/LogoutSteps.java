package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.Login;
import utils.BaseClass;

public class LogoutSteps {
	public WebDriver driver;
	public Login login;
	public WebDriverWait wait;

	
	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		driver=BaseClass.driver;
		login=new Login(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	    login.setUsrname(username);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	   
		login.setpswrd(password);
	}

	@Given("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    
		login.clickloginbtn();
	}

	@Given("User is already loggedin")
	public void user_is_already_loggedin() {
	   Assert.assertTrue(login.CheckInventory()); 	
	}

	@When("user clicks on the menu")
	public void user_clicks_on_the_menu() {
	    
		login.clickMenu();
	}

	@When("user clicks on the Logout")
	public void user_clicks_on_the_logout() {
	    
		login.Clicklogout();
	}

	@Then("User should be logged Out")
	public void user_should_be_logged_out() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
	    Assert.assertTrue(login.CheckLoginbtn());
	}
}
