package WebDriver;

import java.io.FileInputStream;

public class ExceptionHandelling {
	
	public static void main(String[] args) {
		// checked Exception
		// Example 1
	
		try {
			// in this block we will write risky code
			Thread.sleep(2000);
			
		}catch(Exception e){
			// in this block we provide alternative solution for the risky code
			e.printStackTrace();
		}
		
		//Example 2
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");	
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}	

}
