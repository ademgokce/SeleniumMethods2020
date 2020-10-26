package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_navigate_Overview {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		driver.close();
		
		

	}

}
