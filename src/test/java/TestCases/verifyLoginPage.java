package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.Constants;

public class verifyLoginPage extends BaseClass{
	@Test(dataProvider="testData")
	public void login(String uname,String password) {
	      
	    LoginPageObjects obj=new LoginPageObjects(driver);
		 
	    obj.enterUsername().sendKeys(uname);
	   
	    obj.enterPassword().sendKeys(password);
	   
	    obj.clickOnLogin().click();
	   
	   driver.navigate().back(); 
	   
	  
	}
	
	
	@DataProvider
	public Object[][] testData() {
		Object[][] data=new Object[2][2];
		data[0][0]=Constants.username1; 
		data[0][1]=Constants.password1;
		data[1][0]=Constants.username2;
		data[1][1]=Constants.password2;
	
		return data;
	}

  }
