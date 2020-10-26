package Methods;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/agokce/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		
		//how to set window
		driver.manage().window().setSize(new Dimension(600, 800));
		
		//how to get size of window
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		
		// how to handle proxy with Chrome
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("username:password.siliconelabs:4555");
		options.setCapability("proxy", proxy);
		ChromeDriver driver = new ChromeDriver();
		
		
		//driver.manage().deleteAllCookies();
		//Cookie cookie = new Cookie("test1", "adem");
		//driver.manage().addCookie(cookie);
		
		driver.manage().getClass()
		
		driver.manage().getCookies();
		
		driver.manage().getCookieNamed("Adem");
		
		driver.manage().getCookies();
		driver.manage().getCookieNamed("ilhan");
		
		Cookie cookie = new Cookie("test1","adem");
		driver.manage().deleteCookie(cookie);
		
		Cookie cookie = new Cookie("test1", "ilhan");
		driver.manage().addCookie(cookie);
		
		
		driver.manage().addCookie(new Cookie("key", "value"));
    } finally {
        driver.quit();
        
        
        driver.manage().deleteCookieNamed("test1");
        
   
        
        
		

	}

}
