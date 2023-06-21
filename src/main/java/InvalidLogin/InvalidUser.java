package InvalidLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidUser {

	
	
	
	WebDriver driver;

	
	public InvalidUser(WebDriver driver)
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
	}
	
	
	 @FindBy(xpath = "//a[normalize-space()='Signup / Login']" )
		
		public WebElement signup;
	  
	  
	  @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
	  
	  public WebElement login;
	  
	  
	  @FindBy(xpath = "//input[@data-qa='login-email']")
	  
	  WebElement email;
	  
	  @FindBy(xpath = "//input[@placeholder='Password']")
	  
	  WebElement pass;
	  
	  @FindBy(xpath = "//button[normalize-space()='Login']")
	  
	  WebElement button;
	  
	  
	  @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	  
	  WebElement obj4;
	  
	  
	  public void Invalidlogin ()
	  
	  {
		  
		  signup.click();
			
			
			System.out.println("Login To Your Account ! is Visible  - "+login.isDisplayed());
			
			Assert.assertTrue(login.isDisplayed(), "Login To Your Account ! is not Visible !");
			
			email.sendKeys("8087@gmail.com");
			
			pass.sendKeys("Rut@vik1");
			
			button.click();
			
		  
		  }
	  
	  
	  public void invalidvisible()
	  
	  {
		  
		  
		
					System.out.println(" Your email or password is incorrect!  is Visible - "+obj4.isDisplayed());
					
					Assert.assertTrue(obj4.isDisplayed(), "Your email or password is incorrect!  is Visible  Not Visible ");
					  
		  
	  }
	
	
	
}
