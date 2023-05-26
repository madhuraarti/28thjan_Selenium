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

// date 8 May 23 

public class example8_getNumericDataAsString
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx"); // create a non static method 
	     
	  String value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue(); // create an object to store a data 
	    System.out.println(value);// for print // Ans = 101
         
	     // note when we write 101 then we have to write '101 after that press enter or control s
	 
    
    }

}
