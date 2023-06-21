package capstone.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteAccount {
	
	
	
WebDriver driver;

	
	public DeleteAccount(WebDriver driver)
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement Continue;
	
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
	WebElement log;
	
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")
	
	WebElement DAccount;
	
	
	@FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
	WebElement DeleteText;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	
	WebElement DButton;
	
	
	
	public void Delete()
	{
		Continue.click();
	}
	
	
	public void visible2()
	{
		System.out.println("Logged As Username  is Visible - "+log.isDisplayed());
		
		Assert.assertTrue(log.isDisplayed(), "Logged As Username  is Visible  Not Visible ");
				
	}
	
	
	public void DeleteAccount()
	{
		DAccount.click();
	}
	
	
	public void visible3()
	{
		System.out.println("Account Deleted  is Visible - "+DeleteText.isDisplayed());
		
		Assert.assertTrue(DeleteText.isDisplayed(), "Account Deleted is Visible  Not Visible ");
		
		DButton.click();
				
	}
	

	
	
	
}
