package Loginuser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserLogin {
	
	
	
WebDriver driver;

	
	public UserLogin(WebDriver driver)
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
  
  
  @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
  
  WebElement obj1;
  
  
  @FindBy(xpath = "//a[normalize-space()='Delete Account']")
  
  WebElement delete;
  
  
  @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
  
  WebElement obj2;
  
  @FindBy(xpath = "//a[@class='btn btn-primary']")
  
  WebElement button2;
  
  
  

	public void  Loginu()
	
	{
		
		
		signup.click();
		
		
		System.out.println("Login To Your Account ! is Visible  - "+login.isDisplayed());
		
		Assert.assertTrue(login.isDisplayed(), "Login To Your Account ! is not Visible !");
		
		email.sendKeys("8087@gmail.com");
		
		pass.sendKeys("Rut@vik1");
		
		button.click();
		
	}
	
	
	public void visiblelog()
	{
		

		
			System.out.println("Logged As Username  is Visible - "+obj1.isDisplayed());
			
			Assert.assertTrue(obj1.isDisplayed(), "Logged As Username  is Visible  Not Visible ");
			
				
		
	}
	
	public void Delete()
	{
		delete.click();
		
		

		System.out.println("Account Deleted  is Visible - "+obj2.isDisplayed());
		
		Assert.assertTrue(obj2.isDisplayed(), "Account Deleted  is Visible  Not Visible ");
		
		
		button2.click();
	}
  
  
	
	

}
