package Screenshot;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import JavascriptExecuterOperation.SeleniumUtils;

public class ActionExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	 // how to hover the element
//		driver.get("https://www.next.co.uk/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		// hidden division popup
//		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@data-testid='snail-trail-container']/li/a"));
	
	// mouse action on list 
//		for(int i =0;i<links.size();i++) {
//		 	WebElement link = links.get(i);
//		 	Actions action = new Actions(driver);
//		 	
//		 	
//		 	action.moveToElement(link);
//		 	action.build().perform();
//		 	System.out.println(link.getText());
//		 	Thread.sleep(2000);
//		}
	
	// to handle resizable element => drag and drop	
		
//		
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(resize, 300, 80);
//		action.build().perform();
		
	
	// Drag and drop
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//	Thread.sleep(2000);			
//	    // action
//	    Actions action = new Actions(driver);
//	    action.dragAndDrop(draggable, droppable).build().perform();
		
	// draggable
		
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		// to switch in iframe
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		// to perform action
//	 	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));	 	
//	 Thread.sleep(2000);
//	    Actions action = new Actions(driver);
//		action.dragAndDropBy(draggable, 200, 100).build().perform();
		
	
	// drag and drop 
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		// to switch in frame
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//	Thread.sleep(2000);
//	    // action
//	    Actions action = new Actions(driver);
//	    action.dragAndDrop(draggable, droppable).build().perform();
	    
	// Right click action
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//	Thread.sleep(2000);
//	    Actions action = new Actions(driver);
//	    action.contextClick(image).build().perform();
		
	// sendkeys (important)
//	    driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//	    WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//	    
//	    Actions action = new Actions(driver);
//	    action.sendKeys(username, "Junaid").build().perform();
//	    action.sendKeys(password, "juned@12331").build().perform();
	    
//by using keyboard action throgh selenium
	    // keydown :- perform the keyboard action  // keyup :- release the keyboard action 
//	    	   action.keyDown(username, Keys.SHIFT).sendKeys("juned").build().perform();
//	           action.keyUp(Keys.SHIFT).build().perform();
//	           
//	           action.sendKeys(password, "abc@123").build().perform();
//	           action.sendKeys(Keys.ENTER).build().perform();
            
	         
	// click or double click
	       driver.get("https://www.next.co.uk/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
	      WebElement link = driver.findElement(By.xpath("//ul[@class='PrimaryDesktopNavigation']/li[6]"));
	      Actions action = new Actions(driver);
	    Thread.sleep(2000); 
	      action.moveToElement(link).click().build().perform();
	      driver.close();
	      
		
		
		
	}
	

}
