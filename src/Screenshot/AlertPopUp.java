package Screenshot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		// this will switch focus from main page to another page	
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// change the focus to alert interface
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText()); 
		al.accept();
//		al.dismiss();
		// change focus from child page to main page
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		System.out.println("Test Pass");
	
		
	}
}
