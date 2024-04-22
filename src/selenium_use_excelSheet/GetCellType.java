package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook file = WorkbookFactory.create(myfile);
		
		Sheet mysheet = file.getSheet("practice 1");
		
		Row getRow = mysheet.getRow(2);
		
		Cell getCell = getRow.getCell(4);
		
		CellType dataTypeOfCell = getCell.getCellType();
		
		System.out.println(dataTypeOfCell);
	}

}
