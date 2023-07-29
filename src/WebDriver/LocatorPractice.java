package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
	// basic level Locator
	// 1. id 
	// 2. name
	// 3. linked text
	// 4. partial link text
	// 5. classname
	// 6. tagname
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	// 1. id   for username and password
	//	 driver.findElement(By.id("id value from the website"));
		
		driver.findElement(By.id("email"));         // land to username tab
		driver.findElement(By.id("pass"));          // land to password tab
		
	// 2. name 
	//driver.findElement(By.name("the value from the attribute"));	
//	
//		driver.findElement(By.name("email"));       // username
//		driver.findElement(By.name("pass"));        // password
	  	
//	// 3. linked text(links => a/img)	 
//	//driver.findElement(By.linkText("full link text data"));	
//		
//		driver.findElement(By.linkText("Forgotten password?"));         // link with text  
//		
//	// 4. partial link text(links/images => a/img)	
//	// partial link text is part of link text linke text which will giver unique result.	
//		
//		driver.findElement(By.partialLinkText("password"));  // partial text of link should be unique
//		
//	// 5. classname
//	//	driver.findElement(By.className("the value for attribute class from the website"));
//		
//		
//		driver.findElement(By.className("inputtext _55r1 _6luy"));  // email
//		
//		driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));   // password
//		
//	// 6. tagname(whenfindout multiple element with a common tag or uique element available on webpage)
//		
//	//	driver.findElement(By.tagName("tag name from the website"));
//		driver.findElement(By.tagName("button"));
//		
//		
//// xpath :-// 1. absolute 
//		   // 2. relative xpath
//		
//		//driver.findElement(By.xpath("paas the captured from website"));
//		
//		driver.findElement(By.xpath("/html/body/div[3]/a[2]"));   // absolut xpath
//		
//		driver.findElement(By.xpath("//div[3]//a[2]"));           // relative xpath    
		
	}
	

	
	
	
	
	
	
	
	
	
	

}
