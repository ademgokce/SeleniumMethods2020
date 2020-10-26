package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_001_WebDriverChrome {

	public static void main(String[] args) {
		
		// Set Property
		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
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
