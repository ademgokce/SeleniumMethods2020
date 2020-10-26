package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_AjaxFormSubmit_007 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), ' Input Forms')]"))).
	    doubleClick().
	    build().
	    perform();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[contains(text(), 'Ajax Form Submit')]")).click();
		
	  
	    
	    driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Adem Gokce");
	    driver.findElement(By.xpath("//textarea[@id='description']")).
	    sendKeys("As you know that we need help still asap. But still no one is even trying to help. Shame on YOU!");
	    
	    driver.findElement(By.xpath("//input[@id='btn-submit']")).click(); 
	    
	    
	    

	}

}
