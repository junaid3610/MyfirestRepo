package Screenshot;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
	
	public static void main(String[] args) {
		
		Set<String> winds;
		Iterator<String> iterate ;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// getwindowhandle() => id for main page only
		// getwindowhandles() => id for main page as well as for child pages.
		
		
//		String id = driver.getWindowHandle();      // this will give me id of main pages only
//		System.out.println(id);
		
		winds=driver.getWindowHandles();     
		iterate = winds.iterator();
		String first_window = iterate.next();          // 1 window is your parent window
		System.out.println("first page id is => "+first_window);
		System.out.println("first url is =>"+driver.getCurrentUrl());        // to get first url
		
	driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click(); // this will open second window
		
	    //second window will open,second id will generate.
	    // itrate => get respective window => switch => action
	
	    winds = driver.getWindowHandles();
	    iterate = winds.iterator();
	    iterate.next();             // 1 window is your parent window
	    
	    String second_window = iterate.next();        // this is for 2 window
	    System.out.println("second page id =>"+second_window);
	    driver.switchTo().window(second_window);
	    
	    System.out.println("Title of second window :-"+driver.getTitle());
	    driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click(); 
	    System.out.println("second url is =>"+driver.getCurrentUrl());           // for second url
	    
	    
	 // third will open and third id will generate
	 // iterate => get respective window => switch => action   
	    
	    winds = driver.getWindowHandles();
	    iterate = winds.iterator();
	    iterate.next();                    // 1 window is your parent window 
	    iterate.next();                    // for 2 window
	 
	    String third_window = iterate.next();                    // this is for third window
	    System.out.println(third_window);
	    driver.switchTo().window(third_window);
	    System.out.println("Title of third window :-"+driver.getTitle());
	    System.out.println("third url is =>"+driver.getCurrentUrl());            // for third url
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("PQR");
		
//		driver.close();                  // this will close third tab only
		driver.quit();                   // close all tab from browser
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
