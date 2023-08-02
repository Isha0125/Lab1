package Resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public static WebDriver driver;
	public Properties prop;
	
	public void Initializer() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	   
		prop=new Properties();
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		else {
			System.out.println("enter valid browser name");
		}
	}
		@BeforeMethod
		public void openurl() throws IOException{
			Initializer();
			String urlname = prop.getProperty("url");
			driver.get(urlname);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		/*
		 @AfterMethod
		 public void Quit(){
		 driver.Quit();
		}
		 */
		
		}
  

	


