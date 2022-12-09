package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import core.Base;
import pageObj.ActitimeLoginPage;

public class NewLoginToActi extends Base{
	
	ActitimeLoginPage acti;
	
	@BeforeMethod
	public void openBrowser() {
		initializeDriver();
		logger.info("browser opened successfully");
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
		logger.info("broswer closed successfully");
		
	}
	
  @Test(enabled = true)
  public void f() {
	  acti = new ActitimeLoginPage();
	  acti.signInToActitime("admin", "manager");
	  
  }
  
  
  
  
}