
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\avni\\TestData.xls");
		FileInputStream io = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(io);
		
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(1);  //2nd cell
		
		String val = cell.getStringCellValue();
		System.out.println(val);
		System.out.println(cell.getStringCellValue());
		
		HSSFCell cell1 = row.getCell(0);
		System.out.println(cell1.getStringCellValue());
		
		
		HSSFRow row1 = sheet.getRow(1);
		HSSFCell cell2 = row1.getCell(2);
		System.out.println(cell2.getStringCellValue());
		
		
		HSSFSheet sheet2 = workbook.getSheetAt(1);
		HSSFRow row3 = sheet2.getRow(1);
		HSSFCell cell5  = row3.getCell(5);
		System.out.println(cell5.getStringCellValue());
		
		HSSFRow row4 = sheet2.getRow(2);
		HSSFCell cell6 = row4.getCell(3);
		System.out.println(cell6.getNumericCellValue());
		
		
		HSSFRow row5 = sheet2.getRow(3);
		HSSFCell cell7 = row5.getCell(0);
		System.out.println(cell7.getBooleanCellValue());
		
		HSSFCell cell8 = row5.getCell(1);
		System.out.println(cell8.getStringCellValue());

		io.close();
		
		
		
	}

}

