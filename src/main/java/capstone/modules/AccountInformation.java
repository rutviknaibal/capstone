package capstone.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInformation {
	
	WebDriver driver;
	
	
	public AccountInformation(WebDriver driver)
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(id  = "id_gender2")
	
	WebElement gender;
	
	
	@FindBy(xpath = "//input[@id='password']")
	
	WebElement pass;
	
	
	@FindBy(xpath= "//select[@id='days']")
	public WebElement enterDay;
	
	@FindBy(xpath= "//select[@id='months']")
	public WebElement entermMonths;
	
	@FindBy(xpath= "//select[@id='years']")
	public WebElement enterYears;
	
	
	@FindBy(xpath = "//label[@for='newsletter']")
	WebElement newsletter;
	
	@FindBy(xpath = "//label[@for='optin']")
	WebElement offer;
	
	
	public void informationclick()
	{
		

		gender.click();
		
		pass.sendKeys("Rut@vik1");
		
		Select day = new Select(enterDay);
		day.selectByVisibleText("18");
		  
		Select month = new Select(entermMonths);
		month.selectByVisibleText("July");
		  
		Select year = new Select(enterYears);
		year.selectByVisibleText("2000");
		
		
		
		
		newsletter.click();
		
		offer.click();
		
		
	}
	
	
	

}
