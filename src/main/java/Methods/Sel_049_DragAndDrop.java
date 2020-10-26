package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_049_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		

		//url        https://jqueryui.com/resources/demos/droppable/default.html
		//firstElement      //*[contains(text(), 'Drag me to my target')]
		//SecondElement 	//*[contains(text(), 'Drop here')]
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();

		driver.get(" https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement firstElement = driver.findElement(By.xpath("//*[contains(text(), 'Drag me to my target')]")); 
		WebElement secondElement = driver.findElement(By.xpath("//*[contains(text(), 'Drop here')]"));
		
		Actions actions = new Actions(driver); 
		//actions.dragAndDrop(firstElement, secondElement).build().perform(); 
		actions.clickAndHold(firstElement).moveToElement(secondElement).build().perform(); 
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
