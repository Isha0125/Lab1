package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
   public static void Selectclass(WebElement element,int index) {
	   Select s = new Select(element);
	   s.selectByIndex(index);
   }
		
   public static void handleAssertions(String actual, String expected, String message) {
	   
	   SoftAssert b=new SoftAssert();
	   
	   String bc=actual;
	   
	   String exp=expected;
	   
	   b.assertEquals(bc, exp, message);
	   
	   b.assertAll();
	   
   }
	

}
