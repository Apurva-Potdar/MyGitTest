package excelSheetHandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myFile = new FileInputStream("D:\\Apurva\\velocity\\Test Case.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		int lastRowNumber = mySheet.getLastRowNum();
		
		int totalNumOfRow=lastRowNumber;
		
		short lastCellNumber = mySheet.getRow(0).getLastCellNum();
		
		int totalNumberOfCell = lastCellNumber-1;
		
		for(int i=0;i<=totalNumOfRow;i++)
		{
			for(int j=0;j<=totalNumberOfCell;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType myCellType = mySheet.getRow(i).getCell(j).getCellType();
				
				
				if(myCellType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
				System.out.print(value+ " ");	
				}
				
				else if(myCellType==CellType.BOOLEAN)
				{
				boolean value1 = myCell.getBooleanCellValue();
					System.out.print(value1+" ");
				}
				else if(myCellType==CellType.NUMERIC)
				{
					double value2 = myCell.getNumericCellValue();
					System.out.print(value2+" ");
				}
			}
			System.out.println();
		}			
	}
}
