package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_isSelected {

	public static void main(String[] args) {
		


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		
		WebElement element = ElementUtils.getElement(driver, By.id("vfb-7-1")); 
		element.click();
		
		System.out.println("Radio button 1 is selected: " + element.isSelected());
		
		WebElement element2 = ElementUtils.getElement(driver, By.id("vfb-7-2")); 
		element2.click();
		
		System.out.println("Radio button 1 is selected: " + element2.isSelected());
		
		 //  vfb-6-0
		
		WebElement element3 = ElementUtils.getElement(driver, By.id("vfb-6-0")); 
		element3.click();
		
		System.out.println("Radio button 1 is selected: " + element3.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		package seleniumConcepts;
//		​
//		import org.openqa.selenium.By;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.WebElement;
//		import org.openqa.selenium.chrome.ChromeDriver;
//		​
//		import io.github.bonigarcia.wdm.WebDriverManager;
//		​
//		public class Sel_11_isSelected {
//		​
//			public static void main(String[] args) {
//				
//				WebDriverManager.chromedriver().setup();
//				
//				WebDriver driver = new ChromeDriver();
//				
//				driver.get("http://demo.guru99.com/test/radio.html");
//		​
//				WebElement element = ElementUtil.getElement(driver, By.id("vfb-7-1"));
//				element.click();
//				
//				System.out.println("Radio Button Option 1 is selected : " + element.isSelected());
//				
//				WebElement element2 = ElementUtil.getElement(driver, By.id("vfb-7-2"));
//				element2.click();
//				
//				System.out.println("Radio Button Option 2 is selected : " + element2.isSelected());
//				System.out.println("Radio Button Option 1 is selected : " + element.isSelected());
//				
//				
//				WebElement element3 = ElementUtil.getElement(driver, By.id("vfb-6-0"));
//				element3.click();
//				
//				if (element3.isSelected()) {
//					System.out.println("Checkbox is selected");
//				}else
//					System.out.println("Checkbox is not selected!");
//				
//				driver.quit();
//		​
//			}
//		​
//
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
