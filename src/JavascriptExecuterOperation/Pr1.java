package JavascriptExecuterOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {
//	// for my practice i create methods
//	public static void clkbyJs(WebDriver driver, WebElement element) {
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("argument[0].click()", element);
//	}
//
//	public static void calrtBjs(WebDriver driver,String message) {
//		JavascriptExecutor js = ((JavascriptExecutor )driver);
//		js.executeScript("alert ("+message+")");
//	}
	
	
	//==========================
	  // programm for webtable
	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://money.rediff.com/losers/nse/weekly/nifty");
//		
//		int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
//		int col = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
//		for(int r =1;r<=row;r++) {
//			for(int c = 1;c<=col;c++){
//				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
//			System.out.print("=>"+value);
//			}
//			System.out.println();
//		}
		
	
   // giver string test234,extract the only number,write a logic?
//		// to find only number
//		String str = "test234";
//		String digit = str.replaceAll("[^0-9]", "");
//		System.out.println(digit);
//	   // to find only uppercase from text
//		String s = "JunaiD123";
//		String s1 = s.replaceAll("[^A-Z]", "");
//	    System.out.println(s1);
//	   // to find only lowercase from text 
//	    String s2= "JunaiD123";
//	    String s3 =s2.replaceAll("[^a-z]", "");
//	    System.out.println(s3);
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abczx");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1233@");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
}	