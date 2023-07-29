package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);           // browser
		
		WebElement createAccbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccbtn.click();
		
		// using explicit xpath
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='Websubmit']")));
		signup.click();
	
		
		
		
	}
	
	
	

}
