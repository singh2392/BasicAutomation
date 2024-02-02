package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	By loginButtonLanding=By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");
	By loginUsername=By.xpath("//input[@id='login']");
	By loginPassword=By.xpath("//input[@id='password']");
	By loginBtnLoginPage= By.cssSelector("input.btn.btn-teal-outline");
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/*
	public void selectLoginPage()
	{
		driver.findElement(loginButtonLanding).click();
	}
	*/
	public void selectLoginBtnLandingPage()
	{
		
		driver.findElement(loginButtonLanding).click();
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(loginUsername).sendKeys(userName);
	}
	
	public void enterUserPassword(String userPassword)
	{
		driver.findElement(loginPassword).sendKeys(userPassword);
	}
	
	public void clickLoginBtnLoginPage()
	{
		driver.findElement(loginBtnLoginPage).click();
	}

}
