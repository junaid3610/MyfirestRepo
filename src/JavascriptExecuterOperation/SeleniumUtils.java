package JavascriptExecuterOperation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
	

	// This is Utility Class.
	// All one time activities will be declared over here. No Common logic/ website action 
	// whenever you will design the method consider user inputs.	

// ============================================ ScreenShot Utility ==================================================
	public static void getscreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   // capture the screenshot for you keep in selenium memory
		Date d = new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File dest = new File ("C:\\Users\\DELL\\Desktop\\Velocity_Katraj\\Facebook_"+filename);
		FileUtils.copyFile(src, dest);
	}
	
//	 ============================================ Java Script Executor ==================================================
				

// creating the boarder.==> Method which accepts the parameter but will not return anything.

       public static void borderbyJS(WebDriver driver,WebElement element) {
       JavascriptExecutor js = ((JavascriptExecutor)driver);
       js.executeScript("arguments[0].style.border='3px solid red'", element);
        
	 }

// =================================== to get title  ==========================================	
    // capturing the title. ==> Method which accepts the parameter but will return title
   	
   	public static String titlebyJS(WebDriver driver) {
   	JavascriptExecutor js = ((JavascriptExecutor) driver);
   	String Title=js.executeScript("return document.title;").toString();
   	return Title;
   	}
// ======================= To click ======================================	
   	
 // click on element
 	public static void clickbyJS(WebDriver driver,WebElement element) {
 		JavascriptExecutor js = ((JavascriptExecutor) driver);
 		js.executeScript("arguments[0].click();", element);
 	}
 	
//  ============== to create alert    ==========================================================
 	// generate userdefined alert.
	
	public static void alertbyJS(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}
	
//   ====================     refresh the page         ===================================================	
	 
		public static void refreshbyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("history.go(0)");
		}
		
//        ==================    Scrolling the page.     =======================================
		
		public static void scrolldownbyJS(WebDriver driver,int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("scroll("+x+","+y+")");    // scroll down	
		}		

// ============  to scroll up   
		
		public static void scrollupbyJS(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("scroll("+x+","+y+")");    // scroll up
		}
		
		// scroll into view.

		public static void scrollIntoViewbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		}
	
}
