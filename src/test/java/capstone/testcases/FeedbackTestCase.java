package capstone.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Feedback.Reviewproduct;
import Feedback.productfeedback;
import Feedback.verifyvisible;
import capstone.baseconfiguration.basecapstone;

public class FeedbackTestCase  extends basecapstone {
	
	

	public productfeedback allobj;
	
	public Reviewproduct reviewobj;
	
	 public verifyvisible review; 
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		allobj=new productfeedback(driver);
		
		reviewobj=new Reviewproduct(driver);
		
		review =new verifyvisible(driver);
	}

	
	@Test
	public void DemoScenario() 
	{
		
		allobj.PerformReview();
		
		reviewobj.EnterReview();
		
		reviewobj.Thankyou();
		
		review.Reviewpro();
	}
	

}
