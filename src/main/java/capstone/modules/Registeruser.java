package capstone.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registeruser {
	
	
	WebDriver driver;
	
	

	public Registeruser(WebDriver driver)
	
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
		
	}
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']" )
	
	public WebElement signup;
	
	
	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
	
	public WebElement signuptext;
	
	
	
	
	
	
	public void Homeclick()
	{
		signup.click();
	}
	
	
	
	public void  Visible()
	{
		
		System.out.println("New User Signup ! is Visible  - "+signuptext.isDisplayed());
		
		Assert.assertTrue(signuptext.isDisplayed(), "New User Signup is not Visible !");
		
		
		
	}
	
	
		
	
}
