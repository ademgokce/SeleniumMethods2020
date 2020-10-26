package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_017_DropDownPage {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/r.php");
		
		ChromeOptions chromeOptions = new ChromeOptions(); 
		chromeOptions.setHeadless(false); 
		
		
		WebElement day = driver.findElement(By.id("day")); 
		WebElement month = driver.findElement(By.id("month")); 
		WebElement year = driver.findElement(By.id("year")); 
		
		Select select1 = new Select(day); 
		select1.selectByIndex(9);
		
		Select select2 = new Select(month); 
		select2.selectByVisibleText("Apr");
		
		Select select3 = new Select(year); 
		select3.selectByVisibleText("2018");
		
		

	}

}
