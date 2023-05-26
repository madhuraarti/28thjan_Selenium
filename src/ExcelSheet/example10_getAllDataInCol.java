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

public class example10_getAllDataInCol
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx"); // create a non static method 
	     
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3"); // create an object to store a data ie row size
	    
	 int lastRowIndex =sh.getLastRowNum();
	 
	        
	 for(int i=0;i<=lastRowIndex;i++)  // row index start from 0 to 3
	 {
	 
       String value= sh.getRow(0).getCell(i).getStringCellValue();
        System.out.println(value);
    }
        
    }
    }
