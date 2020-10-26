package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment4 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://siliconelabs.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		
		

	}

}
