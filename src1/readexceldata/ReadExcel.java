package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadExcel {
  @Test
  public void ReadData() throws IOException {
	  FileInputStream file1 = new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\Book 6.xlsx"); //1st call fileinputstrem class in that give path of that excel file +\\filename.format(.xlxs) 
	  XSSFWorkbook workbook = new XSSFWorkbook(file1);  //Excel file is Workbook
	  XSSFSheet Sheet = workbook.getSheet("May22");  //For calling sheet and store the sheet in workbook here we pass string or in index(i.e. getSheet("May22") or getSheetAt(1)).
	  
	  //Read Student Name Row
	  System.out.println(Sheet.getRow(1).getCell(0).getStringCellValue());
	  System.out.println(Sheet.getRow(2).getCell(0).getStringCellValue());
	  System.out.println(Sheet.getRow(3).getCell(0).getStringCellValue());
	  System.out.println(Sheet.getRow(4).getCell(0).getStringCellValue());
	  System.out.println(Sheet.getRow(5).getCell(0).getStringCellValue());
	  System.out.println(Sheet.getRow(6).getCell(0).getStringCellValue());
	  
	  //Read Mobile Number
	  System.out.println(Sheet.getRow(1).getCell(1).getNumericCellValue());
	  System.out.println(Sheet.getRow(2).getCell(1).getNumericCellValue());
	  System.out.println(Sheet.getRow(3).getCell(1).getNumericCellValue());
	  System.out.println(Sheet.getRow(4).getCell(1).getNumericCellValue());
	  System.out.println(Sheet.getRow(5).getCell(1).getNumericCellValue());
	  System.out.println(Sheet.getRow(6).getCell(1).getNumericCellValue());
	  
	  //Read EmailId
	  System.out.println(Sheet.getRow(1).getCell(2).getStringCellValue());
	  System.out.println(Sheet.getRow(2).getCell(2).getStringCellValue());
	  System.out.println(Sheet.getRow(3).getCell(2).getStringCellValue());
	  System.out.println(Sheet.getRow(4).getCell(2).getStringCellValue());
	  System.out.println(Sheet.getRow(5).getCell(2).getStringCellValue());
	  System.out.println(Sheet.getRow(6).getCell(2).getStringCellValue());
	  
	  //Launching the website that store in excel
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  String URL = Sheet.getRow(1).getCell(3).getStringCellValue();
	  driver.get(URL);
	  
  }
}
