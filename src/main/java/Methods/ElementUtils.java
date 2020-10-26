package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	
	/**
	 * This method is used to handle javaScript alert
	 * @author agokce
	 */
	
	
	public static String getAlertText(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text; 
	}
	
	
	
	public static WebDriver launchBrowser(WebDriver driver, String browserName){
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
			driver = new ChromeDriver(); 
		
		}
		
		else if (browserName.equalsIgnoreCase("fireforx")){
			System.setProperty("webdriver.gecko.driver", "/Users/agokce/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else{
			System.out.println("Browser is not available " + browserName);
		}
		
		return driver; 
	}
	
	
	
	public static void launchURL (WebDriver driver, String url){
		try {
			driver.get(url);
		}
		
		catch(Exception e){
			System.out.println("an exception happened while lauching url");
		}
	}
	
	
	
	public static WebElement getElement(WebDriver driver, By locator){
		waitForPresenceOfElement(driver, locator); 
		WebElement element = driver.findElement(locator); 
		return element;
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator){
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	}
	
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();	
	}
	
	public static void clickOn(WebDriver driver, By locator){
		
	}
	
	
	
	
	
}
