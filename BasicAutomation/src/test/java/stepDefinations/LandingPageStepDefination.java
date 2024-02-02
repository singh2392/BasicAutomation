package stepDefinations;

import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	
	public LandingPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage=testContextSetup.pageObjectManager.getLandingPage();
			
	}
	

    @When("^User searched with product code (.+) and extracted actual code of Product$")
    public void user_searched_with_product_code_and_extracted_actual_code_of_product(String productcode) throws Throwable {
     
    }

}
