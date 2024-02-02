package stepDefinations;

import io.cucumber.java.en.When;
import pageObjects.AddToCartPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class AddToCartPageStepDefination {
	
	TestContextSetup testContextSetup;
	AddToCartPage addToCartPage;
	
	
	public AddToCartPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.addToCartPage=testContextSetup.pageObjectManager.getAddToCartPage();
			
	}
	
	@When("^Added \"([^\"]*)\" items of the selected product to the cart$")
    public void added_something_items_of_the_selected_product_to_the_cart(String strArg1) throws Throwable {
       
    }

}
