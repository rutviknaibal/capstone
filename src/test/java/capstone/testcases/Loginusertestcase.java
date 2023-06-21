package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Loginuser.UserLogin;
import capstone.baseconfiguration.basecapstone;

public class Loginusertestcase extends basecapstone {

	WebDriver driver;
	
	UserLogin login1;
	
	

	@Parameters("Port")
	@BeforeClass
	
	public void capstonesetup (String Port) throws MalformedURLException
	
	{
		
		driver= setUp (Port);
		
		login1 =new UserLogin(driver);
		
	}
	
	

	@Test
	public void callmethod()
	{
		login1.Loginu();
		
		login1.visiblelog();
		
		login1.Delete();
	}
	
	
	
	
}
