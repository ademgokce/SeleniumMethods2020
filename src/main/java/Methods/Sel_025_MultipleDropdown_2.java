package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_025_MultipleDropdown_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectSingleValue(driver, "choice 3");
		
		
	}
	
	
	
	public static void selectSingleValue(WebDriver driver, String value){
	
	List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']")); 
		
	System.out.println(dropList.size());
	
	for(int i = 0; i<dropList.size(); i++){
		String txt = dropList.get(i).getText();
		System.out.println(txt);
		
		
		try {
			if(!txt.isEmpty()){
				if(txt.equals(value)){
					dropList.get(i).click();
					break;
				}
			}
			
		}
		catch(Exception e){
			System.out.println("Warning for Exception: ");
		}
		
		
	}
	
	}
	
	

}
