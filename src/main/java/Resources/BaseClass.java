package Resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void driverInitialize() throws IOException {
		
		//this will read the properties file
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//access the properties file--
	    prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
		     driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox code 
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			//edge code
		}
		else {
			System.out.println("please make sure you have correct browser");
		}
		
	}
	
	@BeforeMethod
	public void openurl() throws IOException {
		 driverInitialize();
		 //this driver have scope
		 
		 String urlName=prop.getProperty("url");
		 driver.get(urlName);
		 driver.manage().window().maximize();
	}
/*	
    @AfterMethod
    public void closeBrowser() {
     driver.quit();
	
		}
  */  
}
	


