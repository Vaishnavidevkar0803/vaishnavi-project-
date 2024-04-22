package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_Column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook workBook = WorkbookFactory.create(file);
		
		Sheet getSheet = workBook.getSheet("practice 1");
		
		for(int i=0;i<=6;i++)
		{
			String ReadColumn = getSheet.getRow(i).getCell(5).getStringCellValue();
			
			System.out.println(ReadColumn);
		}
		System.out.println();

	}

}
