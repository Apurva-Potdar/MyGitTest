package excelSheetHandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream myFile=new FileInputStream("D:\\Apurva\\velocity\\TestCase_Sweegy.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		Row myRow = mysheet.getRow(0);
		
		Cell myCell = myRow.getCell(0);
		

		CellType myCellType = myCell.getCellType();
		System.out.println(myCellType);
	}
		public static void ExcelHandle(int i,int j) throws EncryptedDocumentException, IOException
		{
			FileInputStream myfile1 = new FileInputStream("D:\\\\Apurva\\\\vel\\\\Manual\\\\TestCase_Sweegy.xlsx");
			
			String value = WorkbookFactory.create(myfile1).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
			
		}
		
		



}
