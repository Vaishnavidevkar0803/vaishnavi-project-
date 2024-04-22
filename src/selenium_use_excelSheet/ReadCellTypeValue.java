package selenium_use_excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCellTypeValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook wb = WorkbookFactory.create(myfile);
		
		Sheet getSheet = wb.getSheet("cellTypeValue");
		
		int rows = getSheet.getLastRowNum();
		int totalNumOfRows = rows;
		
		short cells = getSheet.getRow(0).getLastCellNum();
		short totalNumOfCells = cells;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNumOfCells-1;j++)
			{
				CellType cellTypeValue = getSheet.getRow(i).getCell(j).getCellType();
				
				if(cellTypeValue==CellType.STRING)
				{
					String valueString = getSheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(valueString+"  ");
				}
				else if (cellTypeValue==CellType.BOOLEAN)
				{
					boolean valueBoolean = getSheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(valueBoolean+"  ");
				}
				else if (cellTypeValue==CellType.NUMERIC)
				{
					double valueNum = getSheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(valueNum+"  ");
				}
			}
			System.out.println();
		}
	}

}
