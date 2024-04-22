package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook workBook = WorkbookFactory.create(myfile);
		
		Sheet getSheet = workBook.getSheet("practice 1");
		
		String Value = getSheet.getRow(1).getCell(3).getStringCellValue();
		
		System.out.println(Value);//indexing wise value check 
		
	}
	

}
