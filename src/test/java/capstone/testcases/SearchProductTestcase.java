package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import InvalidLogin.InvalidUser;
import SerachProduct.SerachProduct;
import SerachProduct.Serachlogin;
import SerachProduct.Visibletest;
import capstone.baseconfiguration.basecapstone;

public class SearchProductTestcase extends  basecapstone {
	
	
	
	WebDriver driver;
	
	SerachProduct product;
	
	Serachlogin login;
	
	//Visibletest visible;
	
	

	@Parameters("Port")
	@BeforeClass
	
	public void capstonesetup (String Port) throws MalformedURLException
	
	{
		
		driver= setUp (Port);
		
		product=new SerachProduct(driver);
		
		login =new Serachlogin(driver);
		
		//visible =new Visibletest(driver);
		
	}
	
	

	@Test
	public void callmethod()
	{
		
		product.clickProduct();
		product.searchProductVisible();
		product.addToCart();
		product.clickCart();
		
		login.signuplogin();
		
		//visible.verifyproduct();
		
	}
	
	

}
