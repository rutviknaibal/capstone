package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class productfeedback {
	
	WebDriver driver;

	  public productfeedback(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  
	  @FindBy(xpath = "//a[@href='/products']")
	  public WebElement Button;
	  
	 //@FindBy(xpath="//h2[contains(text(),'All Products')]")
	 //  public WebElement AllProduct;
	  
	  //@FindBy(xpath="//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	 
	 @FindBy(xpath = "//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	  public WebElement ViewProduct;
	  
	  public void PerformReview() 
	  {
		  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      	Button.click();
		  
		  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	
		  	
		  
		 	
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    	
			Button.click();
		  
		 	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 	ViewProduct.click();
		 	
		  
		 	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
		  
	  }
	  
	  
}


