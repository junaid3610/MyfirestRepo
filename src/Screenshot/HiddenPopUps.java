package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	driver.manage().window().maximize();
	Thread.sleep(2000);
		// first of all click on close button
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    // click on login button
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abcd@1234");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123432");
	    Thread.sleep(2000);
	 // clicking to request otp button
	    
	    driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
	    

		
		
		
		
		
		
		
	}
}
