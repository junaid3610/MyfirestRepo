package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralScreenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// typecast the driver to take the screenshot interface
// ((TakesScreenshot)driver)		
			
		// getscreenshot(outputType.file)	
			
		// destination => Path+filename+extention(either jpg or png)	
	
		driver.findElement(By.id("email")).sendKeys("shaikh");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//the above step capture screenshot for you and this will keep in selenium memory(JVM memory)
		
		File destination = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshots\\fb.png");
		// above step is file destination 
		FileUtils.copyFile(src, destination);
		
		
	
		
		
	}
	

}
