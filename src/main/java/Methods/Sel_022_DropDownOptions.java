package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_022_DropDownOptions {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day")); 
		WebElement month = driver.findElement(By.id("month")); 
		WebElement year = driver.findElement(By.id("year")); 
		
		Select select = new Select(day); 
		
		List<WebElement> dayOptions = select.getOptions();
        System.out.println(dayOptions.size());
		
        for( WebElement alldays : dayOptions){
        	String alldays1 = alldays.getText();
        	System.out.println(alldays1);
        	
        }
        
        
//        for(int i = 0; i<dayOptions.size(); i++){
//        	String alldays = dayOptions.get(i).getText();
//        	System.out.println(alldays);
//        }
     

	}

}
