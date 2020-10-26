package Methods;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_051_RightClick {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().fullscreen();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions actions = new Actions(driver); 
		
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]")); 
		actions.contextClick(rightClick).build().perform();
		
		WebElement CopyText = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[3]"));
		String txt = CopyText.getText();
		System.out.println(txt);
		
		driver.close();
	}

}
