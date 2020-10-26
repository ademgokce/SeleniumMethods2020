package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel_Test03 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver(); 	
		driver.get("http://the-internet.herokuapp.com/login");
		
		Thread.sleep(2000);
		
		//First Way
		
		//WebElement userElement = driver.findElement(By.name("username")); 
		//userElement.sendKeys("agokce@kenilworthst.org");
		//password
		//WebElement passWord = driver.findElement(By.name("password")); 
		//passWord.sendKeys("adem123");
		
		//Second Way
		
		//driver.findElement(By.name("username")).sendKeys("agokce@kenilworthst.org");
		//driver.findElement(By.name("password")).sendKeys("adem123");
		
		//Third Way
//		By username = By.name("username"); 
//		WebElement userElement = driver.findElement(username); 
//		userElement.sendKeys("agokce@kenilworthst.org"); 
//		
//		By password = By.name("password"); 
//		WebElement userElement2 = driver.findElement(password); 
//		userElement2.sendKeys("agokce@kenilworthst.org"); 
		
		//Fourth Way (ask ElementUtil gives Error)
		//ElementUtil.getElement(driver, username).sendKeys("agokce@kenilworthst.org")
		
	}

}
