package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle(); 
		System.out.println(title);
		
		
		List<WebElement>list = driver.findElements(By.tagName("a")); 
		
		for(int i=0; i<list.size(); i++){
			list.get(i).getText();
		String text=list.get(i).getText();
			
			
			if (!text.isEmpty()) {
				System.out.println(text);
			}
		
			if(text.equals("Forgot Password?")){
				list.get(i).click();
				break;
			}
		}}}
	

