package Screenshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelBasics {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//	FileInputStream file = new FileInputStream("paste here path of excel sheet");

// to read string value	
//		
//		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\est cases for localwel app module online store.xlsx");
//		String name = WorkbookFactory.create(file).getSheet("SK").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(name);
		
// to read numeric value then
	//sd			
//		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");		
//without decimal value can be take by below step
//		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(value);

// with decimal value 		
//		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
//		System.out.println(data);
	    
//		
//		System.setProperty("Webdriver.chrome.driver","\"C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe\"");
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		
//		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Test cases for localwel app module online store.xlsx");
//		String data = WorkbookFactory.create(file).getSheet("SK").getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data);
         
		
		
		
		
		
	}
	
}
