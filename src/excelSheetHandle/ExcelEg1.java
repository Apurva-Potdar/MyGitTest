package excelSheetHandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import commonlyUsedMethOD.CommonlyUsedEg1;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("D:\\Apurva\\vel\\Manual\\TestCase_Sweegy.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		//Row myRow = mysheet.getRow(0);
		
	//	Cell myCell = myRow.getCell(0);
//		String value = myCell.getStringCellValue();
//		
System.out.println(value);
		
	//	CellType myCellType = myCell.getCellType();
	//	System.out.println(myCellType);
		
		ExcelEg4.ExcelHandle( 0, 0);
		CommonlyUsedEg1.ExcelSheetHandle("D:\\Apurva\\velocity\\Book 3.xlsx", "Sheet1", 4, 0);
	}
}
