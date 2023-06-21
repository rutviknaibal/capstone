package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.baseconfiguration.basecapstone;
import capstone.modules.AccountInformation;
import capstone.modules.Addressinformation;
import capstone.modules.DeleteAccount;
import capstone.modules.Registeruser;
import capstone.modules.signupc;


public class testcasecapstone  extends basecapstone  {
	
	WebDriver driver;
	
	
	 Registeruser register;
	
	 signupc signup;
	
	 AccountInformation Account;
	 
	 Addressinformation  address;
	 
	 DeleteAccount delete;
	
	
	
	
	
	
	@Parameters("Port")
	@BeforeClass
	
	
		public void capstonesetup (String Port) throws MalformedURLException
		
		{
		driver= setUp (Port);
		
		register=new Registeruser(driver);
		
		signup=new signupc(driver);
		
		Account =new AccountInformation(driver);
		
		address=new Addressinformation(driver);
		
		delete=new DeleteAccount(driver);
		
		}
	
	
	@Test
	public void callmethod()
	{
		register.Homeclick();
		register.Visible();
		
		signup.signupValues();
		signup.informationVisible();
		
		Account.informationclick();
		
		address.adressinfo();
		address.visible();
		
		delete.Delete();
		delete.visible2();
		delete.DeleteAccount();
		delete.visible3();
		
	}
	
	
}
