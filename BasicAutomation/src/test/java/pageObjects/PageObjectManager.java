package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public AddToCartPage addToCartPage;
	public LandingPage landingPage;
	public CheckoutPage checkoutPage;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage getLoginPage()
	{
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
	}
	
	public LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public AddToCartPage getAddToCartPage()
	{
		addToCartPage=new AddToCartPage(driver);
		return addToCartPage;
	}

}
