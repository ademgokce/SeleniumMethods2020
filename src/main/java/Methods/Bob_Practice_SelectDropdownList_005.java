package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_SelectDropdownList_005 {

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
		driver.findElement(By.xpath("//a[@id='j1_7_anchor']")).click();

		List<WebElement> dropList = driver.findElements(By.xpath("//select[@id='select-demo']/option"));

		System.out.println(dropList.size());

		for (int i = 0; i < dropList.size(); i++) {
			String dropListText = dropList.get(i).getText();
			System.out.println("Here is List: " + dropListText);

		}

		Select days = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

		days.selectByVisibleText("Friday");

		System.out.println();
		System.out.println("***************** Multiple Select List Demo*****************");

		Select states = new Select(driver.findElement(By.xpath("//select[@name='States']")));
		states.selectByValue("Florida");
		states.selectByVisibleText("Texas");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='printAll']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='printMe']")).click();
		states.deselectAll();
		Thread.sleep(2000);
		states.selectByIndex(3);

	}

}
