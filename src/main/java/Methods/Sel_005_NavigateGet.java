package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_NavigateGet {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		// get
		driver.get("https://www.google.com");
		// Navigate
		driver.navigate().refresh();
		
		driver.get("https://www.google.com");
		

	}

}
