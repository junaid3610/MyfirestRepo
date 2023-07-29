package WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
//private static final String TakesScreenshot = null;
	//public static void main(String[] args) {

// iframe handelling		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_lightbulb");
//		driver.switchTo().frame("iframeResult");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[text()='Turn on the light']")).click();
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("//a[contains(@class,'small topnav-icons f')]")).click();
//		driver.findElement(By.xpath("//a[@title='Change Orientation']")).click();
	

 //	public static void main(String[] args) throws IOException  {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.className("email")).sendKeys("shaikh");
//		driver.findElement(By.id("pass")).sendKeys("shaikh");
//	 	
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//		File place = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshots\\facebook.png");
//		
//		FileUtils.copyFile(src, place);
		
		
// how to take simple screenshot
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream 
//			for(int i=0;i<=9;i++) {
//				for(int j=0;j<2;j++) {
//					FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
//					String fullvalue = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
//				    System.out.print(fullvalue+"=>");
//								}	
//		        	System.out.println();			
//		              }
		
			
	    file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		int rownum = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
		System.out.println(rownum);
		for(int i=0;i<=9;i++) {
		
			file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();	
		System.out.println(value);	
		
		}
		
			
			
			
			
			
			
			
			
	}	
	}
		

