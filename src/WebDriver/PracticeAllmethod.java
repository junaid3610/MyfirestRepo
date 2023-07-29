package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAllmethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver_win32version101\\chromedriver.exe\\");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
//		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("abc");
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys("pqr");
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("city-uvw,street-xyz,pin-00000 ");
		WebElement emailid = driver.findElement(By.xpath("//input[@type='email']"));
		emailid.sendKeys("defghi@gmail.com");
		WebElement phonNum = driver.findElement(By.xpath("//input[@type='tel']"));
		phonNum.sendKeys("0988776756");
		WebElement malebutton = driver.findElement(By.xpath("//input[@type='radio']"));	
		malebutton.click();
		WebElement cricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		cricket.click();
		WebElement hockey = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		hockey.click();
	Thread.sleep(2000);
//	
		
//// select list for adobe photoshop
//	
//		WebElement skills = driver.findElement(By.xpath("//select[@type='text']"));
//		Select s = new Select(skills);
//		s.selectByVisibleText("Adobe Photoshop");
//	Thread.sleep(2000);
//	    
////	    WebElement country = driver.findElement(By.xpath("//span[@aria-expanded='false']"));
////	    Select s1 = new Select(country);
////	    s1.selectByValue("India");
//
//	
//	// select dropdown for year
//	   WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
//	   Select s2 = new Select(year);
//	   s2.selectByValue("1996");
//	 Thread.sleep(1000);
//	// select dropdown for month
//	  WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
//	   Select s3 = new Select(month);
//	   s3.selectByVisibleText("June");
//     Thread.sleep(2000);
//	// selecty dropdown for day
//	 WebElement Day = driver.findElement(By.xpath("//select[@id='daybox']"));
//	   Select s4 = new Select(Day);
//	   s4.selectByIndex(23);
//	   
//	// inspect image to check it whether is enable or disabled
//	  WebElement image = driver.findElement(By.xpath("//img[@id='imagetrgt']"));
//	   System.out.println(image.isEnabled());             // true 
//	   System.out.println(image.isDisplayed());           // true  
//	 Thread.sleep(1000);
//	  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));  
//	  password.sendKeys("1234594");
//	// conferm password
//	  WebElement confermpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
//	  confermpass.sendKeys("1234594");
//	 Thread.sleep(3000);
//	 
//	// for refresh page
//	 WebElement refreshbtn = driver.findElement(By.xpath("//button[text()='Refresh']"));
//	 refreshbtn.click();
//	 Thread.sleep(2000);
//	WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
//	home.click();
//	Thread.sleep(4000);
//	
//	driver.findElement(By.xpath("//img[@id='enterimg']")).click();
	
		
	// demo site for practice	
//		
//		driver.get("https://demo.opencart.com/index.php?route=account/register");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jkl");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("0987765434");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("234567");
//		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("234567");
//		driver.findElement(By.xpath("//input[@value='0']")).click();
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("234567");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		driver.findElement(By.xpath("//a[text()='Software']")).click();
//		driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).click();
//	// iphone image is available or not
//		WebElement image = driver.findElement(By.xpath("//img[@alt='iPhone']"));
//		System.out.println("The iphone image "+image.isDisplayed());
//	// palm treo pro image is available or not	
//		WebElement PalmtrioPro = driver.findElement(By.xpath("//img[@alt='Palm Treo Pro']"));
//		System.out.println("Palm trio Pro image is"+PalmtrioPro.isDisplayed());
//		
//		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

		
   // Next site for practice
//		driver.get("https://demo.nopcommerce.com/login");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Register']")).click();
//		driver.findElement(By.xpath("//input[@value='M']")).click();
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("xyz");
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("jklm");
//		WebElement date = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//		Select s = new Select(date);
//		s.selectByValue("23");
//		List<WebElement> day = s.getOptions();
//		System.out.println("total days in List is "+day.size());
//		
//		
//		WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//		Select s2 = new Select(month);
//		s2.selectByVisibleText("June");
//		List<WebElement> Month = s2.getOptions();
//		System.out.println("Total Month in List is "+Month.size());
				
		
//		WebElement birthyear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));		
//		Select s3 = new Select(birthyear);
//		s3.selectByValue("1996");
//		List<WebElement> years = s3.getOptions();
//		System.out.println("Total years in List is "+years.size());
//		
//		
//		System.out.println("for total links =====>");
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='list']"));
		
	
// getAttribute() method use :- the purpose of getAttribute method is to get the value of a text box
//		
//		driver.get("https://www.facebook.com/");
//		//driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		Thread.sleep(2000);
//		 WebElement attr = driver.findElement(By.name("firstname"));
//		 attr.sendKeys("shaikhk");
//		String firstname = attr.getAttribute("value");
//		System.out.println("First name "+firstname);
//getText() method use :- to get the text the text in console
		
//		String textis = driver.findElement(By.xpath("//p[@class='_58mv']")).getText();
//		System.out.println("Text is => "+textis);
//		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
//		Thread.sleep(2000);
	
	
	
	
// opencart account
//		
//		driver.findElement(By.id("input-firstname")).sendKeys("shiakh");
//		driver.findElement(By.id("input-lastname")).sendKeys("Junaid");
//		driver.findElement(By.id("input-email")).sendKeys("asdn@gamil.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9096453453");
//		driver.findElement(By.name("password")).sendKeys("pass123");
//		driver.findElement(By.name("confirm")).sendKeys("pass123");
//		driver.findElement(By.xpath("//input[@value='1']")).click();
		
// wordpress account opening
//		
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("firstname")).sendKeys("Shiakha");
//		driver.findElement(By.xpath("lastname")).sendKeys("jneds");
//		driver.findElement(By.xpath("reg_email__")).sendKeys("mrshaikh@gmail.com");
//		WebElement day = driver.findElement(By.className("birthday_day"));
//		Select m = new Select(day);
//		m.selectByValue("23");
//		WebElement month = driver.findElement(By.id("month"));
//		Select j = new Select(month);
//		j.selectByIndex(5);
//		WebElement year = driver.findElement(By.id("year"));
//		Select l = new Select(year);
//		l.selectByVisibleText("1996");

		
		
		
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 version99\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("sk Juned");
//		driver.findElement(By.id("pass")).sendKeys("12344");
//		
//		WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));		
//		System.out.println(fblogo.isEnabled());
//		System.out.println(fblogo .isDisplayed());
//// get current url		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//// get title		
//		String title = driver.getTitle();
//		System.out.println(title);
//// get text
//		WebElement text = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	//	Thread.sleep(3000);
		
		
// count footer links	
		
//		 WebElement footerlink = driver.findElement(By.xpath("//div[@data-testid='page_footer']"));
//		Select m = new Select(footerlink);
//		List<WebElement> links = m.getOptions();
//		System.out.println(links.size());
//		
//		for(int i=0;i<links.size();i++) {
//			String footerl = links.get(i).getText();
//			System.out.println(i +" "+footerl);
//			
//		}
	
//		   WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		   Select s1 = new Select(birthyear);
//		   List<WebElement> years = s1.getOptions();
//		   System.out.println("Total years in the list "+years.size());  // o/p will be Total years in the list 118
//		
		
//		for(int i=0;i<years.size();i++) {
//			  String year = years.get(i).getText();
//			  System.out.println(i+" => "+ year);
//		 }
		  
		
		
		
		
	}
	
	
	
	
	
	

}
