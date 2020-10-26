package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_IDConcept {

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");
		Thread.sleep(5000); 

		
		//First Usage
		
//		WebElement userElement = driver.findElement(By.id("username")); 
//		userElement.sendKeys("agokce@kenilworthst.org");
//		
//		
//		WebElement password = driver.findElement(By.id("password")); 
//		password.sendKeys("adem123");
//		
//		WebElement loginBTn = driver.findElement(By.id("loginBtn")); 
//		loginBTn.submit();
		
		//Second Usage
		
		driver.findElement(By.id("username")).sendKeys("agokce@kenilworthst.org");
		driver.findElement(By.id("password")).sendKeys("adem123");
		driver.findElement(By.id("loginBtn")).click();
		
		//Third Usage
		By username = By.id("username"); 
		WebElement element = driver.findElement(username);
		element.sendKeys("agokce@kenilworthst.org");
		
		
		//Fourth Usage
		ElementUtils.getElement(driver, username).sendKeys("agokce@kenilworthst.org");
		
	}

}
