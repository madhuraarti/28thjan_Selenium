package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class example3_getStringData
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx");
	     
	    String value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	    System.out.println(value);
         
	     
	 
    
    }

}
