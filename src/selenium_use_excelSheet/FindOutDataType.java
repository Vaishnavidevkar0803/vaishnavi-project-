package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FindOutDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");	
	
	Workbook workbook = WorkbookFactory.create(myfile);
	
	Sheet getSheet = workbook.getSheet("practice 1");
	
	CellType dataType = getSheet.getRow(0).getCell(3).getCellType();
	
	System.out.println(dataType);
	}

}
