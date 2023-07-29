package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void getscreenshot(WebDriver driver) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File src = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		System.out.println(d);
		String filename =d.toString().replace(" ", "").replace(":", "_")+".png";
		File dest = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshots"+filename);
		FileUtils.copyFile(src, dest);

		
		
		
		
		
		
		
	
	}
}
