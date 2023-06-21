package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import InvalidLogin.InvalidUser;

import capstone.baseconfiguration.basecapstone;

public class InvalidUserTestcase  extends  basecapstone{
	
	InvalidUser obj2;

	
	WebDriver driver;
	
	
	
	

	@Parameters("Port")
	@BeforeClass
	
	public void capstonesetup (String Port) throws MalformedURLException
	
	{
		
		driver= setUp (Port);
		
	 obj2=new InvalidUser(driver);
		
	}
	
	

	@Test
	public void callmethod()
	{
		
		obj2.Invalidlogin();
		
		obj2.invalidvisible();
		
		
		
	}
	
	
	
	
	
}
