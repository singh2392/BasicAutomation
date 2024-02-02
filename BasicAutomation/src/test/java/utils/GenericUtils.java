package utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
	    Iterator<String> itr1= s1.iterator();
	    String parentWindow=itr1.next();
	    String childWindow=itr1.next();
	    driver.switchTo().window(childWindow);
	}
	
	public String getLocalCurrentTime()
	{
		String pattern = "hh:mm a";
		
        
        //Get the local machine current time instance
        LocalTime now = LocalTime.now();
        
        //Pass the time pattern in the method DateTimeFormatter.ofPattern(). Method LocalTime.format() return the time as per given pattern in String format
        String localCurrentTime=now.format(DateTimeFormatter.ofPattern(pattern));
        return localCurrentTime;
	}
	
	public void refreshDashboard()
	{
		
	}

}
