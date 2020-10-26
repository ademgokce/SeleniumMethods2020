package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_CheckboxDemo_003 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		
		
		Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), ' Input Forms')]"))).
	    doubleClick().
	    build().
	    perform();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@id='j1_5_anchor']")).click();
	    driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
	
	      
	    List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for ( WebElement el : els ) {
	        if ( !el.isSelected() ) {
	            el.click();
	           
	        }
	    }

	    Thread.sleep(3000);
	    List<WebElement> els1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for ( WebElement el1 : els1 ) {
	        if ( el1.isSelected() ) {
	            el1.click();
	    
	        }}
	    
	    
	  Thread.sleep(3000);
	    // anather way to uncheck with parent Xpath
//	    WebElement parent = driver.findElement(By.xpath("<enter parent xpath>"));  
//	    List<WebElement> children = parent.findElements(By.cssSelector("input:checked[type='checkbox']"));  
//	    for (int i = 0; i < children.size(); i++) 
//	    { children.get(i).click(); } 
	    
	  //input[@id='check1']
	  
	  driver.findElement(By.xpath("//input[@id='check1']")).click();
	    
	    
	    
	    
	
	}}
