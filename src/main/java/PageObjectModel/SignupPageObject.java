package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	//this driver don't have scope
	public WebDriver driver;
	
	private By UserFirstName=By.xpath("//input[@name='UserFirstName']");
	private By UserLastName=By.xpath("//input[@name='UserLastName']");
	private By UserWorkEmail=By.xpath("//input[@name='UserEmail']");
	private By UserJobTitle=By.xpath("//input[@name='UserTitle']");
	private By UserCompany=By.xpath("//input[@name='CompanyName']");
	private By UserPhone=By.xpath("//input[@name='UserPhone']");
	private By UserCountry=By.xpath("//select[@name='CompanyCountry']");
    private By UserEmployees=By.xpath("//select[@name='CompanyEmployees']");
	private By Checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By StartMyFreeTrial=By.xpath("//button[@name='start my free trial']");
     
	

	public SignupPageObject(WebDriver driver2) {
    
	this.driver=driver2;
	
	}
	
	public WebElement enterUserFirstName() {
		return driver.findElement(UserFirstName);
	}
	
	public WebElement enterUserLastName() {
		return driver.findElement(UserLastName);
	}
	
	public WebElement enterUserWorkEmail() {
		return driver.findElement(UserWorkEmail);
	}
	
	public WebElement UserJobTitle() {
		return driver.findElement(UserJobTitle);
	}
	
	public WebElement enterUserCompany() {
		return driver.findElement(UserCompany);
	}
	
	public WebElement enterUserEmployees() {
		return driver.findElement(UserEmployees);
	}
	
	public WebElement enterUserPhone() {
		return driver.findElement(UserPhone);
	}
	
	public WebElement enterUserCountry() {
		return driver.findElement(UserCountry);
	}
	
	public WebElement enterCheckbox() {
		return driver.findElement(Checkbox);
	}
	
	public WebElement enterStartMyFreeTrial() {
		return driver.findElement(StartMyFreeTrial);
	}
	
 }
