package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_HomeTab_001 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(), 'Start Practice')]")).click();

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("First Button");

		// Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));

		element.click();

		String button1 = element.getText();

		if (button1.equals("Show Message")) {
			System.out.println("First Button Element: " + button1);
		} else {
			System.out.println("Not First Button Element: " + button1);
		}

		WebElement value1 = driver.findElement(By.xpath("//input[@id='sum1']"));
		value1.sendKeys("5");
		WebElement value2 = driver.findElement(By.xpath("//input[@id='sum2']"));
		value2.sendKeys("4");
		WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
		button2.click();

		String txt = button2.getText();
		if (txt.equals("Get Total")) {
			System.out.println("Second Button Element: " + txt);
		} else {
			System.out.println("Not Second Button Element" + txt);
		}

		WebElement element3 = driver.findElement(By.xpath("//*[contains(text(), 'Total a + b ')]"));

		String txt2 = element3.getText();

		WebElement result = driver.findElement(By.xpath("//span[@id='displayvalue']"));

		System.out.println(txt2 + "= " + result.getText());

		driver.close();

	}

}
