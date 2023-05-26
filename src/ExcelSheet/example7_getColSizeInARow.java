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

public class example7_getColSizeInARow
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx"); // create a non static method 
	     
	  short colSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum(); // create an object to store a data ie col size
	    System.out.println(colSize);// for print // Ans = 3
         
	     
	 
    
    }

}
