package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.processing.SupportedSourceVersion;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_The_Whole_ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook workBook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = workBook.getSheet("practice 1");
		
		for(int i=0;i<=6;i++)//rows
		{
			for(int j=0;j<=6;j++)//cell
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+"    ");
			}
			System.out.println();
		}
	}

}
