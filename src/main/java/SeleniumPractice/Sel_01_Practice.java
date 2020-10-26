package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_01_Practice {

	public static void main(String[] args) throws InterruptedException {
		

//		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
//		
//		WebDriver driver = new ChromeDriver(); 
//		driver.get("https://www.google.com");
//		Thread.sleep(3000);
//		driver.close();
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		

		
		// how to get webElements 
		
		WebElement userElement = driver.findElement(By.xpath("//input[@id='login1']"));
		userElement.sendKeys("youtube"); 
		
		WebElement userElement2 = driver.findElement(By.xpath("//input[@id='password']")); 
		userElement2.sendKeys("adem123");
		
		WebElement btn = driver.findElement(By.xpath("//input[@name='proceed']")); 
		btn.click();
		
		String str = driver.getTitle(); 
		System.out.println(str);
		
		if(str.equals("Rediffmail")){
			System.out.println("Correct Title");
		}
		
		else {
			System.out.println("Not Correct One");
		}
		
		
		
		
		driver.findElement(By.id("username")).sendKeys(keysToSend);
		

	}

}




















