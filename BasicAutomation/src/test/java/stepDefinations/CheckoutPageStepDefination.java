package stepDefinations;

import io.cucumber.java.en.Then;
import pageObjects.AddToCartPage;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {
	
	TestContextSetup testContextSetup;
	CheckoutPage checkoutPage;
	
	
	public CheckoutPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
			
	}
	
	 @Then("^User continue to Checkout$")
	    public void user_continue_to_checkout() throws Throwable {
	       
	    }

}
