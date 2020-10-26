package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_050_MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.verizonwireless.com/");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS); 
	
		WebElement phoneMenu = driver.findElement(By.xpath("//button[@id='gnav20-Shop-L1-mobile-goback']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(phoneMenu).build().perform();
		
		By smartPhone = By.xpath("//a[@id='gnav20-Shop-L3-1']");
		WebElement locator = driver.findElement(smartPhone);
		locator.click();
		
	}

}
