package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Test04 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver(); 	
		
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=cta--small");
		
		Thread.sleep(2000);
		
		
		// //*[@id="username"]
		////input[@id='username']
		
		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']")); 
		userElement.sendKeys("agokce@kenilworthst.org");
	}

}
