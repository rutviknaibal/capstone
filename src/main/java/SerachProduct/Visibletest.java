package SerachProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Visibletest {
	
	
	WebDriver driver;

	  public Visibletest (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
		@FindBy(xpath="//*[text() = 'All Products']")     //to All product  visible
		public WebElement Allproduct;
		
		
	
		public void verifyproduct()
		{
			
			System.out.println("All products are Visble " + Allproduct.isDisplayed() );
			
			Assert.assertTrue(Allproduct.isDisplayed(),"All products  is not Visble ");
			
		
		
		}
	

}
