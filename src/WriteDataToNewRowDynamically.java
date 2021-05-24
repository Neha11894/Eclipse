
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteDataToNewRowDynamically {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\avni\\TestDataNew.xls");
		FileInputStream io = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(io);
		HSSFSheet sheet = workbook.getSheet("Sheet3");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		
		HSSFRow row = sheet.createRow(lastRow+1);
		short lastCell = row.getLastCellNum();
		HSSFCell cell = row.createCell(lastCell+1);
		cell.setCellValue("Java");
		
		
		FileOutputStream op = new FileOutputStream(file);
		workbook.write(op);
		
		op.close();
		io.close();
		
	}

}
