package Screenshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdvanced {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream
	// reading the multiple values from single column
		
//		for (int i=0;i<=9;i++) {     // starts from 0 index number and ends on 9th index
//			FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
//			String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
//			System.out.println(value);
//		
//		}
		
	// if want to start from 1 index and ends on 5th index	
//		for (int i=1;i<6;i++) {  // starts from 0 index number and ends on 5th index
//			FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
//			String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
//			System.out.println(value);		
//		}
		
		// reading the data from multiple rows and column.
//		for(int i=0;i<=9;i++) {
//			for(int j=0;j<2;j++) {
//				FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
//				String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
//				System.out.print(value+"=>");
//				
//			}  // inner loop for column cells
//			System.out.println();
//		} // outer loop for rows 
//		
		
		// reading the row value dynamically.
		
//		 file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
//		int rownum = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
//		System.out.println(rownum);
//		
//		for (int i=0;i<=rownum;i++) {   
//			file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
//			String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
//			System.out.println(value);
//	}	
//		
	
//          // reading row and column dynamically	
		file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
		int rownum = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
		System.out.println(rownum);      // this is for row
		
		file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
		int column = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		System.out.println(column);     // this is for column
//		
	// reading multiple data
		for(int i=0;i<=rownum;i++) {
			for(int j=0;j<column;j++) {           // don't put lessThanEqulto to column 
				file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");				
				String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"=>");
				
			}  // inner loop for column cells
			System.out.println();
		} // outer loop for rows 
		
		
		
		
		
	}
}
