package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginPageStepDefination {
	
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	
	public LoginPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage=testContextSetup.pageObjectManager.getLoginPage();
			
	}

	@Given("^User is on BaseStore Landing page$")
    public void user_is_on_basestore_landing_page() throws Throwable {
        
    }
	
	@Given("^User is on Login page$")
    public void user_is_on_login_page() throws Throwable {
		
		Thread.sleep(10000);
       loginPage.selectLoginBtnLandingPage();
    }

    @When("^User login into Application with \"([^\"]*)\" and \"([^\"]*)\" from Login page$")
    public void user_login_into_application_with_something_and_something_from_login_page(String username, String password) throws Throwable {
    	
    	loginPage.enterUserName(username);
    	loginPage.enterUserPassword(password);
    	loginPage.clickLoginBtnLoginPage();
        
    }
    
    @And("^Displayed the Login Page$")
    public void displayed_the_login_page() throws Throwable {
        
    }

    @Then("^User login into Application with wrong \"([^\"]*)\" and \"([^\"]*)\" from Login page$")
    public void user_login_into_application_with_wrong_something_and_something_from_login_page(String strArg1, String strArg2) throws Throwable {
      
    }

    @Then("^Validate message displayed$")
    public void validate_message_displayed() throws Throwable {
      
    }

    
	
}
