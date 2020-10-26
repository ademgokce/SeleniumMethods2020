package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sel_001_WebDriverBasic {

	public static void main(String[] args) throws InterruptedException {
		
		
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver"); 
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		Thread.sleep(3000);
//		
		
		
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=‘btn btn-danger’]"));
		
		Alert alert = driver.switchTo().alert(); 
		
		String text = alert.getText(); 
		
		System.out.println("text: " + text);
		
		alert.accept();
		
		
		
		
		driver.close();

	}

}
