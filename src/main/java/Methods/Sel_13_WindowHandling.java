package Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_13_WindowHandling {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window " + parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> iterators = handles.iterator();
		
		String parent = iterators.next();
		System.out.println("Parent window " + parent);
		
		String child = iterators.next();
		System.out.println("Child window " + child);
		
		// Switching to child window
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		System.out.println("Child window title is : " + driver.getTitle());
		
		driver.close();
		
		// Switching back to parent window
		driver.switchTo().window(parent);
		System.out.println("Parent window title " + driver.getTitle());
		
		driver.quit();
	}
}
