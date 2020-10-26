package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class ElementUtilbyAdem {

	
	public static String getAlertText(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String text =alert.getText(); 
		System.out.println(text);
		return text;
	}
	

	
	
	
	
	
	//*[@id="username"]
	
	
	
	}	
	
}
