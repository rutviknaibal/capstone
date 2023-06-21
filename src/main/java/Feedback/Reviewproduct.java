package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Reviewproduct {
	
	
	WebDriver driver;

	  public Reviewproduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Write Your Review']")
	  public WebElement Msg;
	  
	  @FindBy(id="name")
	  public WebElement Name;
	  
	  @FindBy(id="email")
	  public WebElement Email;
	  
	  @FindBy(id="review")
	  public WebElement WriteReview;
	  
	  @FindBy(id="button-review")
	  public WebElement SubmitReview;
	  
	  @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
	  
	  public WebElement thanky;
	  
	  public void EnterReview()
	  {	
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      Msg.isDisplayed();
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      Name.sendKeys("Rutvik");
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
		  Email.sendKeys("rutvik@gmail.com");
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
		  WriteReview.sendKeys("Sab Changa Haii ");
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
		  SubmitReview.click();
		  
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
	  }

	  
	  public void Thankyou()
	  {
		  
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
		   System.out.println("Thank You For Your Review "+thanky.isDisplayed());
		   
		   
		  
		  	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	 
			Assert.assertTrue(thanky.isDisplayed(), "Thank You For Your Review");
		  
		  
		
		  
	  }
	

}
