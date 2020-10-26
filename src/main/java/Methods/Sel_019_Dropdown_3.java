package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_019_Dropdown_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");

		By day = By.id("day"); 
		By month = By.id("month"); 
		By year = By.id("year"); 

	}

	public static void selectDropdownValueByText(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select select =  new Select(element); 
		select.deselectByVisibleText(value);
	}

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator); 
		return element;
	}
	
	
	
	
	
	
	
	
	

}
