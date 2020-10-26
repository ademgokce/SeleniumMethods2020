package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bob_Practice_RadioButtonsDemo_004 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bobit.us/Practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		
		
		Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[contains(text(), ' Input Forms')]"))).
	    doubleClick().
	    build().
	    perform();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@id='j1_6_anchor']")).click();
	    driver.findElement(By.xpath("//body/div[contains(@class,'m-10px')]/div[@class='row']/div[@class='col-md-9']/div[@id='pr-area']/div[@id='practice1-3']/div[@class='practice-body']/div[@class='card card-default']/div[@class='card-body']/label[1]")).click();
	   
	    WebElement button1 = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
	    button1.click();
	    String txt1 = button1.getText(); 
	    
	    WebElement buttonResult = driver.findElement(By.xpath("//p[@class='radiobutton']"));
	    String txt2 = buttonResult.getText(); 
	    System.out.println(txt1 + " = " + txt2);
	    
	    WebElement button2 = driver.findElement(By.xpath("//div[@class='card-body']//div//label[@class='radio-inline'][contains(text(),'Male')]"));
	    button2.click();
	    String txt3 = button2.getText(); 
	    System.out.println(txt3);
	    
	
	    
	    WebElement button3 = driver.findElement(By.xpath("//label[contains(text(), '15 to 50')]"));
	    button3.click();
	    String txt4 = button3.getText(); 
	    System.out.println(txt4);
	     
	    
	    WebElement button4 = driver.findElement(By.xpath("//button[contains(text(), 'Get values')]"));
	    button4.click();
	    String txt5 = button4.getText(); 
	    System.out.println(txt5);
	    
	    System.out.println();
	    System.out.println("****** Final Button Click Result ******");
	    WebElement button5 = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
	    button5.click();
	    String txt6 = button5.getText(); 
	    System.out.println(txt6);
	    
	 
	    
	    
	    
	}

}
