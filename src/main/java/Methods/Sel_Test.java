package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Test {

	public static void main(String[] args) throws InterruptedException {
	
/*
 * here is how to go web site with different browsers (chrome and firefox)		
 */
		
		
System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver"); 
//System.setProperty("webdriver.gecko.driver", "/Users/agokce/Documents/Drivers/geckodriver");	

WebDriver driver = new ChromeDriver(); 

//WebDriver driver = new FirefoxDriver(); 

driver.get("https://www.kenilworthschool.org/"); 

Thread.sleep(3000);

String title = driver.getTitle(); 

System.out.println("Here is title: " + title);

if(title.equals("Kenilworth Science and Technology Charter School - Baton Rouge, LA")){
	System.out.println("title is CORRECT");
}
else {
	System.out.println("title is not Correct");
}


String url = driver.getCurrentUrl(); 
System.out.println("Here is correct url: " + url);


driver.navigate().to(url);

Thread.sleep(3000);

driver.navigate().to("http://www.ebay.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();



driver.close();



	}

}
