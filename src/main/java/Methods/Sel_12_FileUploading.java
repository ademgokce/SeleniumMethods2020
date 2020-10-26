package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_FileUploading {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement fileUpload = ElementUtils.getElement(driver, By.id("uploadfile_0"));
		
		fileUpload.sendKeys("/Users/agokce/Desktop/ScreenShot/screen.png");
		
		driver.findElement(By.id("submitbutton")).click();
		

	}

}
