package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
   By searchIcon= By.xpath("(//a[@class='search-form-btn'])[1]");
   By searchBox= By.xpath("//input[@id='key']");
   By searchBoxIcon= By.xpath("//button[@value='Search']//i[@class='spk-icon spk-icon-search ada_screen_icon']");
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

}
