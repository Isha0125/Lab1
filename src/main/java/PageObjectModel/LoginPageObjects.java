package PageObjectModel;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	 
	//this driver don't have scope
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	private By errormessage=By.xpath("//div[@id='error']");
		
	public LoginPageObjects(WebDriver driver2) {
	     this.driver=driver2;
	}
	
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}


		public WebElement enterUsername() {
			
			return driver.findElement(username);
		}
		

		public WebElement enterPassword() {
			
			return driver.findElement(password);
		}
	

		public WebElement clickOnLogin() {
			
			return driver.findElement(login);
		}
	
	    
        public WebElement clickOnTryForFree() {
			
			return driver.findElement(TryForFree);
		}
        
        public WebElement errorText() {
			
			return driver.findElement(errormessage);
		}
	
	}