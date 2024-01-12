package excelSheetHandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myFile=new FileInputStream("D:\\Apurva\\velocity\\Test Case.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
		Row myrow = mySheet.getRow(0);
		
		Cell myCell = myrow.getCell(0);
		
		CellType myDataType = myCell.getCellType();
		
		System.out.println(myDataType);
		
		System.out.println(myCell.getStringCellValue());
		

	}

}
