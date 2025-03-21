package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	@CacheLookup
	WebElement Usrname;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement pswrd;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[1]/div[2]/div")
	WebElement PageHeader;
	
	@FindBy(css="div.inventory_list")
	WebElement Inventory;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement AddtoCartbtn;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement CartBadge;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement Cartbtn;
	
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement InsideCartItem;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkOutbtn;
	
	@FindBy(xpath="//*[@id=\"first-name\"] ")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement Pcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finishbtn;
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	WebElement OrderSuccessMsg;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement Menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement Logoutbtn;
	
	
 //login	
	public void setUsrname (String uname) {
		Usrname.sendKeys(uname);
	}
	
	public void setpswrd(String pass) {
		pswrd.sendKeys(pass);
	}
	
	public void clickloginbtn() {
		loginbtn.click();
	}
	
	public String CheckTitle() {
		return PageHeader.getText();
	}

 //AddtoCart
	
	public boolean CheckInventory() {
		return Inventory.isDisplayed();
	}
	
	public void AddtoCart() {
		AddtoCartbtn.click();
	}
	
	public int CheckCartBadge() {
	    try {
	        return Integer.parseInt(CartBadge.getText());
	    } catch (NumberFormatException e) {
	        return 0; // Return 0 when cart is empty
	    }
	}
	
	public void ClickonCart() {
		Cartbtn.click();
	}
	
	public String InsideCart() {
		return InsideCartItem.getText();
	}
	
	
	//CartCheckout
	public void ClickCheckout() {
		checkOutbtn.click();
	}
	
	public void firstname(String firstname) {
		fname.sendKeys(firstname);
	}
	
	public void lastname(String lastname) {
		lname.sendKeys(lastname);
	}
	
	public void Code(String Code) {
		Pcode.sendKeys(Code);
	}
	
	public void ClickContinue() {
		continuebtn.click();
	}
	
	public void ClickFinish() {
		finishbtn.click();
	}
	
	public String SuccesMsg() {
		return OrderSuccessMsg.getText();
	}
	
	
	//logout
	public void clickMenu() {
		Menu.click();
	}
	
	public void Clicklogout() {
		Logoutbtn.click();
	}
	
	public boolean CheckLoginbtn() {
		return loginbtn.isDisplayed();
	}
}
