import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_ElementVisibility {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.linkedin.com/login");
		
		
		By signIn = By.xpath("//button[text()='Sign in']"); 
		
		WebElement element = driver.findElement(signIn);
		
		boolean display = element.isDisplayed();
		System.out.println("Element is displayed: " + display);
		
		
		boolean enabled = element.isEnabled();
		System.out.println("Element enabled is: " + enabled);
		
		driver.quit();
	}

}
