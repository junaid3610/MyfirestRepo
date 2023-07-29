package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandelling {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32version101\\chromedriver.exe\"" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// switch by using id (way 1 by id of frame)			
		//	driver.switchTo().frame("iframeResult");

// switch by using xpath	(way 2 by xpath of frame)
		WebElement iframeelement = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframeelement);
	
	
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me!']"));
		clickme.click();

// how to switch to parent frame back
		// two ways to switch to parent frame
		//1:- way 1
		//driver.switchTo().parentFrame();
        //2:- way 2  	
		driver.switchTo().defaultContent();
		WebElement changetheme = driver.findElement(By.xpath("//a[@title='Change Theme']"));
		changetheme.click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
