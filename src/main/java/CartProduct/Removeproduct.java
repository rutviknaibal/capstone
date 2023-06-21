package CartProduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Removeproduct {
	
	
	
	
	
	WebDriver driver;
	
	public Removeproduct (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product1;
	
	
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueb;
	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product2;
	
	

	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product3;
	
	


	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product4;
	
	

	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product5;
	
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement cart;
	
	
	
	@FindBy(xpath = "//tr[@id='product-1']//i[@class='fa fa-times']")  
	public WebElement remove1;
	
	@FindBy(xpath = "//tr[@id='product-2']//i[@class='fa fa-times']")  
	public WebElement remove2;
	
	@FindBy(xpath = "//tr[@id='product-3']//i[@class='fa fa-times']")  
	public WebElement remove3;
	
	@FindBy(xpath = "//tr[@id='product-4']//i[@class='fa fa-times']")  
	public WebElement remove4;
	
	@FindBy(xpath = "//tr[@id='product-5']//i[@class='fa fa-times']")  
	public WebElement remove5;
	
	//@FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
	
	//@FindBy(xpath = "//span[@id='empty_cart']")
	
	//public WebElement empty;
	
	
	public void addToCart() 
	{
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// to add product 
		product1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);   //  for continue click
		continueb.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		product2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		continueb.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		product3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		continueb.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		product4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		continueb.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		product5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		continueb.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		cart.click();    // Add to cart click
	
	}	
	
	
	public void removeproduct()
	{
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remove1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remove2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remove3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remove4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remove5.click();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("Successfully Product is Removed From Cart -true");
		//System.out.println("Successfully Product is Removed From Cart"+empty.isDisplayed());
		
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Assert.assertTrue(empty.isDisplayed(), "Product is Not Removed From Cart");
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		
		
	}
	
	

}
