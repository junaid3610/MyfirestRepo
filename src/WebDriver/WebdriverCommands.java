package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
	
	// 1. how to lounch the browser
		// 2. how to open url
		// 3. how to close the browser
		// 4. how to quit the browser
		// 5. how to get current url
		// 6. how to get the title of page
		// 7. how to maximize the browser
		// 8. how to navigate to different pages
		// 9. how to set the size of browser
		// 10. how to set the position of browser.
		
		
		public static void main(String[] args) throws InterruptedException {
			
			// 1. how to launch the browser
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe" );
	//when you copy path then this will path will comes with single backword slash then you should 
	// add double backward slash manually.where-where single backward slash is available do this carefully
	// single forward slash is also accepted but it is not good practice in coding]
			
			// invoke the webdriver
		    WebDriver driver = new ChromeDriver();
		    
			// 2. how to open url.to open any url we have get() command.
		    
		    driver.get("https://www.google.com/");
		    
					
			// 3. how to close the browser.to close browser we have close() command.
		 //   driver.close();
		    
		    
		 // 4. how to quit the browser.this will close all tabs command is quit() command.
		   //  driver.quit();    // at a time i used only one command either close or quit.
		    //close command close only single tab,i.e current tab
		   // quit command close all tabs.
		    
		    
		 // 5. how to get current url
		    String url = driver.getCurrentUrl();
		    System.out.println(url);
			 
//			System.out.println(driver.getCurrentUrl()); // this type alsoo accepted to get current url
			
			
		 // 6. how to get the title of page
		    String expectedtitle = "Google";
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
		    
			if(expectedtitle.equalsIgnoreCase(actualtitle)) {
				System.out.println("Testcase is passed");
			}
			else {
				System.out.println("tastcase is fail");
			}
			
		// 7. how to maximize the browser 
			driver.manage().window().maximize();
			
	    // 8. how to navigate to different pages	
			
			driver.navigate().to("https://www.facebook.com/");
			// isme pahle google open hoga fir facbaook open hoga, b'coz google ka url pahele mention kiya maine 
			// isliye pahele google khulega fir facebook khulega. 
			
			
			driver.navigate().back();             //google-facbook and finally stop on google
			
			driver.navigate().forward();          // google-facebook-google-facebook
			
			driver.navigate().refresh();     
			// this will refresh and open to facebook b'coz of forword command
			
	// you can not minimize but you can set the size(this is trial & error)
			
			
			// 9. how to set the size of browser	
			
			Dimension d= new Dimension(100,300);           // import from org.openqa.selenium
			 // here 100 is width and 300 is length		
			driver.manage().window().setSize(d);
			
			
			// 10. how to set the position of browser.
			Point p = new Point(500,800);                   // import from org.openqa.selenium
			driver.manage().window().setPosition(p);
		
			Thread.sleep(2000);                          // isme time milisecond me dalna padta
			
	// to close the browser.  
//			driver.close();                          // this will close my current tab only.
			
			driver.quit();                 // this will close all tabs available in the browser.
			
	// my additional method
			
			System.out.println("shaikh");
			Thread.sleep(15000);
			System.out.println("Juned");
			
			
		}
	
	
	

}
