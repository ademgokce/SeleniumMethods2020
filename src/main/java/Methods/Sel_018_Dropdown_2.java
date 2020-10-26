package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_018_Dropdown_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/r.php");
		
		
		WebElement day = driver.findElement(By.id("day")); 
		WebElement month = driver.findElement(By.id("month")); 
		WebElement year = driver.findElement(By.id("year")); 
		
		selectDropDownValueByText(day, 5); 
		selectDropDownValueByText(month, 3); 
		selectDropDownValueByText(year, 7); 
		
		
	}
	
//	public static void selectDropDownValueByText(WebElement element, String value){
//		Select select = new Select(element);
//		select.selectByVisibleText(value);
//	
//	}
	
	
	// two different way to get it by ID and byText
	
	
	public static void selectDropDownValueByText(WebElement element, int value){
		Select select = new Select(element);
		select.selectByIndex(value);
	
	}
	
	

}
