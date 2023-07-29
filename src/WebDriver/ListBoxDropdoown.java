package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDropdoown {
	
	public static void main(String[] args) throws InterruptedException {
		
//		==> Create main method
//		==> Launch the browser
//		==> Enter the url
//		==> Identify the list box which needs to be handled and store it in refrence variable.	
//		==> Create an object of select class which accepts the webelement argument.
//		==> Use Select Class methods to select the options from the list
//		==> selectByIndex();
//		    selectByValue();
//			selectByVisibleText();
		
//		==> To check all options use getoptions method.Store all elements in list.Loop over the list to check all elements and get required attribute or text.
//		==> To check defalult options use getfirstselectedoption() method and get the attribute or text.


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Signup.click();
		Thread.sleep(2000);
		
// identify list box which needs to be handled
//		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		  // create the object of select class and pass the respective
	//	Select s= new Select(birthday);
		
		
		// To handled the values usa any method given below
	      // s.selectBy(index) =>index starts from 0 and ends on n-1		
	      // s.selectByvalue(arg) => String form
	      // s.selectByVisibleText(arg) => String form
	
       //      s.selectByIndex(10);              // this option will int value  o/p will be 11
         
	//     	s.selectByValue("23");               // option will accept the String type
		
//		    s.selectByVisibleText("19");
		
// to get all the element available in dropdown menu
// to check all option available in the list
		
//		   WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		   Select s1 = new Select(birthyear);
//		   List<WebElement> years = s1.getOptions();
//		   System.out.println("Total years in the list "+years.size());  // o/p will be Total years in the list 118
//		 for(int i=0;i<years.size();i++) {
//			  String year = years.get(i).getText();
//			  System.out.println(i+" => "+ year);
//		 }
		   
//		   int j=1;
//		 for(WebElement year:years) {
//			 System.out.println(j + " "+ year.getText());
//			 j++;
//		 }
		
// check the defoult option
		
//		  WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		   Select s1 = new Select(birthyear);
//		    String firstoption = s1.getFirstSelectedOption().getText();
//		    System.out.println( "Defoult year is "+firstoption);
		
		// defoult action on Month dropdown/list
//		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select s= new Select(birthMonth);
//		String defoultmonth = s.getFirstSelectedOption().getText();
//		System.out.println("Defoult month is "+defoultmonth);

		// defoult action on Date
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		String defoultDay = s.getFirstSelectedOption().getText();
		System.out.println("Defoult day is "+defoultDay);
		
	
		
		
	}
	
}
