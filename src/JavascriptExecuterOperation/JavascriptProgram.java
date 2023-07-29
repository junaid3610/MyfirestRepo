package JavascriptExecuterOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptProgram {
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// drawing the border around the element
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		SeleniumUtils.borderbyJS(driver, TryitBtn);
				
//	//	writing java script program
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='3px solid red'", TryitBtn);
	     
	//  to get title of the page
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String titlebyjs = js.executeScript("return document.title;").toString();
//		System.out.println(titlebyjs); 
		// using util class
	//	System.out.println(SeleniumUtils.titlebyJS(driver));
		

	// to click on the element 
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		// to click by javascript
//		WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		// javascript for click
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", TryitBtn);
	// by using util method
	//	SeleniumUtils.clickbyJS(driver, TryitBtn);

		
		
	// to create alert pop-up
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	// javascript for create alert pop-up
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("alert('" + "The facebook Site is launched" + "')");
		// by using util class
		//SeleniumUtils.alertbyJS(driver, "The facebook site is launched");
	
		
	
	// Refreshing the page	
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor )driver);
//	// to see refresh page we apply wait	
//		Thread.sleep(2000);
//		js.executeScript("history.go(0)");
//		SeleniumUtils.refreshbyJS(driver);
		
		
	// scrolling => scroll up/scroll down/scroll into view 
		
		// to scroll down
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		JavascriptExecutor js = ((JavascriptExecutor )driver);
//		js.executeScript("scroll(0,1500)");
		// by using util class
//		SeleniumUtils.scrolldownbyJS(driver, 0, 2000);
	
		
		
		// to scroll up
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		JavascriptExecutor js = ((JavascriptExecutor )driver);
//		js.executeScript("scroll(0,2000)");
//		Thread.sleep(2000);
//		js.executeScript("scroll(0,500)");
		// scroll up by util class=>for scroll up first we have to do scroll down then scroll up
//		SeleniumUtils.scrolldownbyJS(driver, 0, 2000);
//		Thread.sleep(2000);
//		SeleniumUtils.scrollupbyJS(driver, 0, 500);
		
		
	// scroll into view
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement DisclaimerBtn = driver.findElement(By.xpath("//a [text()='Disclaimer']"));
//		// javascript for this
//		JavascriptExecutor js =((JavascriptExecutor )driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", DisclaimerBtn);
//		DisclaimerBtn.click();
		// by using util class
		SeleniumUtils.scrollIntoViewbyJS(driver, DisclaimerBtn);
		SeleniumUtils.clickbyJS(driver, DisclaimerBtn);
	
		
		
	}

}
