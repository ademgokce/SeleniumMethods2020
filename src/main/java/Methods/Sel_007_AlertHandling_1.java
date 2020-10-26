package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_AlertHandling_1 {

	
	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//locator
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		getAlertText();
		driver.quit();
		System.out.println("Alert is handled ");
		
		

	}
	
	
	public static String getAlertText(){
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text; 
	}
	
	

}
