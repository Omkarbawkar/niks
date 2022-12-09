package readexceldata;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class WriteExcel {
  @Test
  public void WriteData() throws IOException {
	  FileInputStream file1 = new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\Book 6.xlsx"); 
	  XSSFWorkbook workbook = new XSSFWorkbook(file1);  
	  XSSFSheet Sheet = workbook.getSheet("May22");
	  
	  Row row = Sheet.createRow(7); //Select row
	  Cell cell = row.createCell(0); //select column where to write data in excel
	  cell.setCellValue("Ankita Dhakane"); //data
	  FileOutputStream file2 = new FileOutputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\Book 6.xlsx");
	  workbook.write(file2); //for writing data
	  file2.close(); //for closing file
	  
	  
  }
}
