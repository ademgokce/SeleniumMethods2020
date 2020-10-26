package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Test2 {

	public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("agokce@kenilworthst.org");
		//driver.findElement(By.name("passwd")).sendKeys("adem123");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo()alert();
		
	
		Thread.sleep(2000);
		driver.close();
	}

}
