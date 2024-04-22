package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCellDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
	     Workbook wb = WorkbookFactory.create(myfile);
	     
	    Sheet mySheet = wb.getSheet("Sheet4");
	    
	    int rows = mySheet.getLastRowNum();
	    int totalnumOfRows = rows;
	   
	   short cells = mySheet.getRow(0).getLastCellNum();
	   int totalNumOfCells = cells;
	    
	   for(int i=0;i<=totalnumOfRows;i++)//rows
	   {
		   for(int j=0;j<=totalNumOfCells-1;j++)//colums
		   {
			 CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
			 
			 if(cellDataType==CellType.STRING)
			 {
				String stringValue = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(stringValue+" ");
			 }
			 else if(cellDataType==CellType.NUMERIC)
			 {
				double numValue = mySheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(numValue+" ");
			 }
			 else if(cellDataType==CellType.BOOLEAN)
			 {
				 boolean boleanValue = mySheet.getRow(i).getCell(j).getBooleanCellValue();
				 System.out.print(boleanValue+" ");
			 }
		   }
		   System.out.println();
		 
	   }
	}

}
