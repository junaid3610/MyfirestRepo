package Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotMain {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		
		ScreenShot.getscreenshot(driver);
		
		
	}

}
