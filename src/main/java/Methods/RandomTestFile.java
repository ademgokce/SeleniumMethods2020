package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomTestFile {

	public static void main(String[] args) throws InterruptedException {
		

		
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		By goBtn = By.name("proceed"); 
		
		WebDriver driver = null;
		
		driver = ElementUtils.launchBrowser(driver, "chrome"); 
		
		ElementUtils.launchURL(driver, url);
		
		System.out.println(ElementUtils.getPageTitle(driver));
		
		ElementUtils.clickOn(driver, goBtn);

		Thread.sleep(2000);
		
		driver.close();
		
	}

	
}
