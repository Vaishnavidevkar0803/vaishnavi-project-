package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_Whole_Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook workBook = WorkbookFactory.create(myfile);
		
		Sheet getSheet = workBook.getSheet("practice 1");
		
		for(int i=0;i<=6;i++)
		{
	       String valueOfRow = getSheet.getRow(2).getCell(i).getStringCellValue();
	       
	       System.out.print(valueOfRow+" ");
		}
		System.out.println();
	}

}
