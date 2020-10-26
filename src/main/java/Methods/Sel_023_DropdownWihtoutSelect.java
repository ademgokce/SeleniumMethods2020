package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_023_DropdownWihtoutSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		
		
		
		List<WebElement> daylist = driver.findElements(By.xpath("//select[@id='day']/option"));
		
		System.out.println(daylist.size());
		
		for(int i = 0; i<daylist.size(); i++){
			String text = daylist.get(i).getText(); 
			System.out.println(text);
			
			if(text.equals("9")){
				daylist.get(i).getText();
				break;
			}
			
		}
		

	}

}
