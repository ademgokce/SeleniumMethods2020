package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_WebDriverFF {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver(); 	
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		driver.close(); 
		System.out.println("Test Completed...!");
		
		driver.get

	}

}
