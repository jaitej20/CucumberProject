package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.Login;
import utils.BaseClass;

public class CartCheckout {
	
	public WebDriver driver;
	public Login login;
	
	@Given("user has a product in the cart")
	public void user_has_a_product_in_the_cart() {
		driver=BaseClass.driver;
		login=new Login(driver);
		
		Assert.assertTrue(login.InsideCart().contains("Sauce Labs"), "Cart doesn't have product");
	    
	}

	@When("user clicks on the checkout")
	public void user_clicks_on_the_checkout() {
		
		login.ClickCheckout();
	    
	}

	@When("user enters first name as {string}")
	public void user_enters_first_name_as(String firstname) {
	    
		login.firstname(firstname);
	}

	@When("user enters last name as {string}")
	public void user_enters_last_name_as(String lastname) {
		
		login.lastname(lastname);
	    
	}

	@When("user enters the pincode as {string}")
	public void user_enters_the_pincode_as(String Code) {
		login.Code(Code);
	    
	}

	@When("user clicks on continue")
	public void user_clicks_on_continue() {
	    
		login.ClickContinue();
	}

	@When("user clicks on finish")
	public void user_clicks_on_finish() {
		
		login.ClickFinish();
	    
	}

	@Then("user should be displayed order confirmation message {string}")
	public void user_should_be_displayed_order_confirmation_message(String ConfirmationMsg) {
		String ActualMsg=login.SuccesMsg();	
		Assert.assertEquals(ActualMsg, ConfirmationMsg);
	}


}
