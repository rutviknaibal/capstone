package SerachProduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Serachlogin {
	
	
WebDriver driver;

	
	public Serachlogin (WebDriver driver)
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
	}
	
	

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	
	public WebElement signup;
	
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	
	public WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement pass;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	public WebElement login;
	
	@FindBy(xpath= "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement Addcart;
	
	
	
	public void signuplogin()
	
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		email.sendKeys("anushree@007.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		pass.sendKeys("Rut@vik1");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		login.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Addcart.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		
	}
	
	
	
	
	
}
