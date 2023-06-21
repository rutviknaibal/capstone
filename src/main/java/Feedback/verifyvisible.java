package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class verifyvisible {
	
	
	WebDriver driver; 

	  public verifyvisible(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  
	  @FindBy(xpath = "//a[contains(text(),'Write Your Review')]")
	  
	  WebElement review ;
	  
	  
	  
	  
	  public void Reviewpro()
	  {
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  System.out.println("Write Your Review "+review.isDisplayed());
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			Assert.assertTrue(review .isDisplayed(), "Write Your Review");
		  	
		  
	  }
	  
	  
}
