package keyworddrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	//read data from propertu file
	public String getPropData(String PropPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(PropPath);
		Properties prop= new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key, "IncorrectKey");
		return propValue;	
	}
//read data from excel
	public String getCellData(String excelPath,String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String excelValue=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelValue;
	}
	//Write data into excel 
	public void setCellData(String excelPath,String sheet,int row,int Cell,String data)throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(Cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}
}
