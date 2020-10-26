package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_013_XPath {

	public static void main(String[] args) throws InterruptedException {
		

		// learn how to customize Xpath and Css
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");
		Thread.sleep(5000); 
		
		driver.findElement(By)
		
		//input[id='loginBtn']
		
		
		By username = By.xpath("//input[@id='username']"); 
		By userPass = By.xpath("//input[@id='password']"); 
		
		
		
		
		
	}

}
