package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_JquerySelectDropdown_008 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), ' Input Forms')]"))).doubleClick().build()
				.perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='j1_10_anchor']")).click();
		
		driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();
		
		//span[@id='select2-country-container']

		// Select country = new Select(
		// driver.findElement(By.xpath("//span[@id='select2-country-container']")));
		// Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		//First click on dropdown to show options 
		WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		dropdown.click();

		//Now find desired option and click 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("select2-country-result-7kg6-Bangladesh"))).click();

		
		
		
		
		
		
	}

}
