package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr5 {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

}
}
