package datadrivenframework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws Throwable {
	 FileInputStream fis = new FileInputStream("F:\\New folder\\KCSM4\\AutomationFrameworks\\data\\Inputdata.xlsx"); 
	 
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("sheet1");
	Row r = sh.getRow(5);
	Cell c = r.getCell(0);
	String Excelvalue = c.getStringCellValue();
	System.out.println(Excelvalue);
	}
	
	}

