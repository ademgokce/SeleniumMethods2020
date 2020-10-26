package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_024_MultipleDropdown_1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']")); 
		
		System.out.println(dropList.size());
		
		for(int i =0; i<dropList.size(); i++){
			String text = dropList.get(i).getText();
			System.out.println(text);
			
//			if(!text.isEmpty()){
//				dropList.get(i).click();
//			}
			
			
			if(text.equals("choice 3")){
				dropList.get(i).click();
				break;
			}
			
			
		}
		
		

	}

}
