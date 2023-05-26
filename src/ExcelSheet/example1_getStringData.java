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


public class example1_getStringData
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\may excel\\28Jan23.xlsx");
         
	     
	     Workbook book = WorkbookFactory.create(file);    // diffClassname.methodname();
	    
	     Sheet sh = book.getSheet("Sheet1");
	     Row rw =sh.getRow(0);
	     Cell c1= rw.getCell(0);
	     String value = c1.getStringCellValue();
	     System.out.println(value);
    
    }

}
