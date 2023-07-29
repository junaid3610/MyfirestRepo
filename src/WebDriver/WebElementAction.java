package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAction {
	
	private static String id;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\Selenium jars\\Chromedriver_win32 107\\chromedriver 107.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook com/");
	//	driver.manage().window().maximize();
//		Thread.sleep(1000);

		
	//	 WebElement Emailid = driver.findElement(By.xpath("//input[@name='firstname']"));
	//	 Emailid.sendKeys("ABCD");
		
	//	 WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
	//	 Password.sendKeys("123432@123");
		 
   // or another way for sendkey is in below, 
//		driver.findElement(By.xpath("xpath(\"//input[@name='email']")).sendKeys("Sk Junaid");
//		
//		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		CreateNewAcc.click();
//		Thread.sleep(2000);
//// 1.Sendkeys():-for first name		 
//		 
//		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		firstname.sendKeys("abc");
//	// for surname
//		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		surname.sendKeys("pqr");
//	// for mobile number or email-id	
//		WebElement emailid = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		emailid.sendKeys("abcpqr@gamil.com");
//	// for re entered email or mobile number	
//		WebElement confermEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
//		confermEmail.sendKeys("abcpqr@gamil.com");
//		
//	// for password
//		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//		Password.sendKeys("abc@12343");
//		Thread.sleep(1000);
//	// date of birth
//		// for day
//		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
//		Day.sendKeys("23");
//		// for month
//		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
//		Month.sendKeys("june");
//		// for Year
//		WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
//		Year.sendKeys("1996");
//
//// action on radio button 		
//		WebElement Malebutton = driver.findElement(By.xpath("//label[text()='Male']"));
//		Malebutton.click();
// use of is-Enabled() :-     o/p of this is boolean eihter true or false
//		System.out.println(Malebutton.isEnabled());
	
		
// isEnable action for emailAdress/phone number field
		
//		WebElement Emailid = driver.findElement(By.xpath("//input[@name='email']"));
//		System.out.println(Emailid.isEnabled());   // o/p is boolean
//		
//		if(Emailid.isEnabled()==true) {
//			Emailid.sendKeys("abc@1234");
//		}else {
//			System.out.println("the element is intractable or disabled");
//		}
	// for 	action for Password
//		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
//		
//		if(Password.isEnabled()==true) {
//			Password.sendKeys("123@asd");
//			System.out.println("testCase is pass,field is Enabled");
//		}else {
//			System.out.println("field is Disabled");
//		}
	
	// isEnable action for facebook logo
//		WebElement Fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		if(Fblogo.isEnabled()==true) {
//			System.out.println("it is Enabled");
//		}else {
//			System.out.println("it is disabled");
//		}
//		
//		
//	// action for select your pronoun (action on custom radio button)	
//		WebElement selectpronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
//		System.out.println("select you Status"+ selectpronoun.isEnabled());

// 4. isdisplayed():- this method is for all element/images/messages then you have to use this 
//		WebElement fblogo = driver.findElement(By.xpath("//img[starts-with(@class,'fb_logo')]"));
//		                     // o/p is boolean
//		System.out.println("Fb logo Status :-"+fblogo.isDisplayed() );
//		
// 5. is selected():-boolean result:- use for radio button/checkbox
//		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		CreateNewAcc.click();
//		Thread.sleep(2000);
//		
//		WebElement Maleoptionbutton = driver.findElement(By.xpath("//input[@value='2']"));
//		System.out.println("Male option Status "+ Maleoptionbutton.isSelected()); 
//		// o/p will be false b'coz not selected
//		Maleoptionbutton.click();
//		// o/p will be true b'coz selected
//		System.out.println("Male option Status "+ Maleoptionbutton.isSelected());
		    
// 6. gettext():- use to get text of any element for varification or further coding		
//		String actualtext = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
//		String expectedtext = "Sign Up";
//	
//		if(actualtext.equals(expectedtext)) {
//			System.out.println("testCase pass for Sign up text Verification");
//		}else {
//			System.out.println("testCase fail for sign up text verification");
//		}
	
		
// 7. get attribute:-this method will return value for the required attribute		
	
//		String attributeid = driver.findElement(By.xpath("//input[@name='email']")).getAttribute(id);
//		System.out.println(attributeid);  
//		
//		String actualTitle = driver.findElement(By.xpath("//a[text()='Watch']")).getAttribute("title");
//		String expectedTitle = "Browse our Watch videos.";
//		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
//			System.out.println("TestCase is passed");
//		}else {
//			System.out.println("Test case is failed");
//		}

// 8. multiple Element
		
	// how to deal with multiple element.you have to locate element and extract each and every element then use multiple element method
		// ex.company requiredment is 
		// collect all footer links and get links for it and count it
//	 	List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[starts-with(@class,'uiList pageFooterLinkList')]/li/a"));
//		System.out.println(footerlinks.size());
//		
//		for(int i=0;i<footerlinks.size();i++) {
//			String footer = footerlinks.get(i).getAttribute("href");
//			System.out.println(i+" => "+footer);
//	
		
		
		
		}
	}

}
