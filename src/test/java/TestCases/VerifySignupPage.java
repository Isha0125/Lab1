 package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObject;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignupPage extends BaseClass {
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		 LoginPageObjects obj=new LoginPageObjects(driver);
		 obj.clickOnTryForFree().click();
		 
		 SignupPageObject objs=new SignupPageObject(driver);
		
		 Thread.sleep(5000);		   
		 
		 objs.enterUserFirstName().sendKeys(Constants.UserFirstName);
		 
		 objs.enterUserLastName().sendKeys(Constants.UserLastName);
		   
		 objs.enterUserWorkEmail().sendKeys(Constants.UserWorkEmail);
		 
		 objs.UserJobTitle().sendKeys(Constants.UserJobTitle);
		 
		 objs.enterUserCompany().sendKeys(Constants.UserCompany);
		 
		// Select b = new Select(objs.enterUserEmployees());
			
		// b.selectByIndex(1);
		 
		 objs.enterUserPhone().sendKeys(Constants.UserPhone);
		 
		/* Select i = new Select(objs.enterUserCountry());
			
		 i.selectByIndex(4);
		 
		 objs.enterCheckbox().click();
		 
		 objs.enterStartMyFreeTrial().click();
		 */
	}

 }
