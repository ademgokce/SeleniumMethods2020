package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_InputForms_002 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Start Practice')]")).click();
		
		Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), ' Input Forms')]"))).
	    doubleClick().
	    build().
	    perform();
		
	    driver.findElement(By.xpath("//a[@id = 'j1_3_anchor']")).click(); 
		WebElement element1 = driver.findElement(By.xpath("//div[@class='card-body']//div[1]//input[1]"));
		element1.sendKeys("Admin");
		
		WebElement element2 = driver.findElement(By.xpath("//div[@class='card-body']//div[2]//input[1]"));
		element2.sendKeys("Admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id ='message-success']"));
		
		String result22 = element3.getText(); 
		
		System.out.println(result22);
		
		// Result22 supposed to give Login Success but not working properly
		
	}

}
