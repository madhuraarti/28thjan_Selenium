package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// date 9 May 23 

//get all data

public class example13_getAllDataInRow1
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx"); // create a non static method 
	     
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet5"); // create an object to store a data ie row size
	    
	          int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
	
	  for (int i=0; i<=lastCellIndex;i++)   // outer for loop -->rows
	 {
		 Cell cellInfo = sh.getRow(0).getCell(i);
		 CellType s1= cellInfo.getCellType();
		
		 
		 if(s1==CellType.STRING)
		 {
			 String value = cellInfo.getStringCellValue();
			 System.out.print(value+" ");
		 }
	    
		 else if (s1==CellType.NUMERIC)
		 {
			 double value = cellInfo.getNumericCellValue();
			 System.out.print(value+" ");
		 }
		 else if (s1==CellType.BOOLEAN)
		 {
			 boolean value = cellInfo.getBooleanCellValue();
			 System.out.print(value+" ");
		 }
	 }
    
	 
	 
    }
    }
