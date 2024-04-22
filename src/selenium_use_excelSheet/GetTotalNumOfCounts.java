package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTotalNumOfCounts {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook wb = WorkbookFactory.create(myfile);
		
		Sheet mysheet = wb.getSheet("practice 1");
		
		int totalNumOfRows = mysheet.getLastRowNum();
		int totalRows = totalNumOfRows;
		System.out.println(totalRows+1);
		
	   short cells = mysheet.getRow(0).getLastCellNum();
	   short totalNumOfCells = cells;

	   System.out.println(totalNumOfCells);
		
		
	}

}
