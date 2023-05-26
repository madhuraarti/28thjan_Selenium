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

public class example6_getRowSizeInASheet
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx"); // create a non static method 
	     
	  int rowSize=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1; // create an object to store a data ie row size
	    System.out.println(rowSize);// for print // Ans = 4
         
	     
	 
    
    }

}
