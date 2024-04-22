package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheEcxel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook wb = WorkbookFactory.create(myfile);
		
		Sheet getSheet = wb.getSheet("practice 1");
		int rows = getSheet.getLastRowNum();
		int totalNumOfRows = rows;
		
		short Cell = getSheet.getRow(0).getLastCellNum();
		int totalNumOfCell = Cell-1;
		
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<totalNumOfCell;j++)
			{
				String value = getSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
	}

}
