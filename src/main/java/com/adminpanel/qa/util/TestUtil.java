package com.adminpanel.qa.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import com.adminpanel.qa.base.TestBase;


public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICITLY_WAIT=10;
	
	public static String TESTDATA_SHEET_PATH= "D:\\oops\\SaasModel\\src\\main\\java\\com\\adminpanel\\qa\\testdata\\Builder.xlsx";
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file=null;
		 try {
			  file=new FileInputStream(TESTDATA_SHEET_PATH);
		   } catch (FileNotFoundException e) {
			   e.printStackTrace();
		   }
			try {
				 book = WorkbookFactory.create(file);
			} catch(InvalidFormatException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		sheet=book.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k< sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
				//System.out.println(data[i][k]);
				
				
			}
		}
		//System.out.println("Check data of worksheet-->"+data[0][5]);
		/*data[0][5]="9873084508";
		data[0][9]="10";
		data[0][10]="5";*/
		return data;
		}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}
	
	
	
	
		

}
