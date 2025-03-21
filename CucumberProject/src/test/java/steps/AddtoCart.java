package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.Login;
import utils.BaseClass;

public class AddtoCart {
	
	public WebDriver driver;
	public Login lgn;
	
	
	@Given("the user is viewing the list of products")
	public void the_user_is_viewing_the_list_of_products() {
		driver=BaseClass.driver;
		lgn=new Login(driver);
		
		lgn.setUsrname("standard_user");
		lgn.setpswrd("secret_sauce");
		lgn.clickloginbtn();
		
		if(lgn.CheckInventory()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	   
	}

	@When("the user clicks on the Add to Cart button for a product")
	public void the_user_clicks_on_the_add_to_cart_button_for_a_product() {
	    
		lgn.AddtoCart();
	}

	@Then("the cart icon should be updated to reflect the added product")
	public void the_cart_icon_should_be_updated_to_reflect_the_added_product() {
	   
		Assert.assertEquals(lgn.CheckCartBadge()>0, true);
	}

	@When("the user clicks on the cart icon")
	public void the_user_clicks_on_the_cart_icon() {
	    
		lgn.ClickonCart();
	}

	@Then("the added product should be displayed in the cart")
	public void the_added_product_should_be_displayed_in_the_cart() {
	  
		Assert.assertTrue(lgn.InsideCart().contains("Sauce Labs"), "Cart doesn't have product");
	}

}
