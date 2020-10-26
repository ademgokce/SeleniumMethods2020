package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_InputFormSubmit_006 {

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
	    driver.findElement(By.xpath("//a[@id='j1_8_anchor']")).click();

	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Adem");
	    driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gokce");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("batonrouge@kenilworth.org");
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("225 255 5555");
	    driver.findElement(By.xpath("//input[@name='address']")).sendKeys("5151 Higland Dr. Downtown ");
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Baton Rouge");
	    
	    Select states = new Select(driver.findElement(By.xpath("//select[@name='state']"))); 
	    states.selectByVisibleText("Louisiana");
	    
	    driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("70808");
	    driver.findElement(By.xpath("//input[@name='website']")).sendKeys("kenilworthst.org");
	    driver.findElement(By.xpath("//div[@class='col-md-8']//div[1]//label[1]")).click();
	    driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).
	    sendKeys("We need maintenance of Server as quick as possible, it stop working last two days");
	    driver.findElement(By.xpath("//button[@class='btn btn-default w-100']")).click();
	    
	    Thread.sleep(4000);
	    driver.close();
	    
	    
	}

}
