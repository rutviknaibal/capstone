package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CartProduct.Removeproduct;
import InvalidLogin.InvalidUser;
import capstone.baseconfiguration.basecapstone;

public class RemovecartTestcase extends basecapstone {
	
	
	Removeproduct product;
	
	WebDriver driver;
	
	
	
	

	@Parameters("Port")
	@BeforeClass
	
	public void capstonesetup (String Port) throws MalformedURLException
	
	{
		
		driver= setUp (Port);
		
	 product=new Removeproduct(driver);
		
	}
	
	

	@Test
	public void scenarioDemo() throws InterruptedException
	{
		product.addToCart();
		
		product.removeproduct();
	}

	
	
	
}
