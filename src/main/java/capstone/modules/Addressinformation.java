package capstone.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Addressinformation {
	
	WebDriver driver;

	
	public Addressinformation(WebDriver driver)
	{
		this.driver=driver;   
		
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;
	
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	
	
	@FindBy(xpath =  "//input[@id='address1']")
	WebElement address;
	
	
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;
	
	
	//@FindBy(xpath= "//select[@id='country']")
	//public WebElement country;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	

	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;
	
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobile;
	
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	
	WebElement create;
	
	@FindBy(xpath = "//b[contains(text(),'Account Created!')]")
	
	WebElement created;
	
	
	
	public void adressinfo()
	{
		firstname.sendKeys("Rutvik");
		
		lastname.sendKeys("Yadav");
		
		company.sendKeys("Axis");
		
		address.sendKeys("Samata Colony");
		
		address2.sendKeys("Auranagabad");
		
		//Select count = new Select(country);
		//country.selectByVisibleText("Canada");
		
		
		state.sendKeys("Maharshtra");
		
		city.sendKeys("Auragabad");
		
		zipcode.sendKeys("432134");
		
		mobile.sendKeys("8876775544"); 
		
		create.click();
			
		
	}
	
	
	public void visible()
	{
		System.out.println("Account Created !  is Visible - "+created.isDisplayed());
		
		Assert.assertTrue(created.isDisplayed(), "Account Created  is  Not Visible ");
				
	}
	
	
			
	
}
