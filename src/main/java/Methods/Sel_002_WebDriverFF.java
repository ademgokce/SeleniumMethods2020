package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverFF {

	public static void main(String[] args) {
		// Set Property
				System.setProperty("webdriver.gecko.driver", "/Users/agokce/Documents/Drivers/geckodriver");
				
				WebDriver driver = new FirefoxDriver(); 
				driver.get("https://siliconelabs.com/");
				String title = driver.getTitle(); 
				System.out.println(title);
				
				if(title.equals("Silicone Labs")){
					System.out.println("Test is Correct");
				}
				else{
					System.out.println("Test is NOT Correct");
				}
				
				driver.close();
				System.out.println("Testing is done");


	}

}
