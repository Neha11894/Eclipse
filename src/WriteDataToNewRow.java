import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteDataToNewRow {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\avni\\TestDataNew.xls");
		FileInputStream io = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(io);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("Hello World");
		
		FileOutputStream op = new FileOutputStream(file);
		workbook.write(op);
		
		op.close();
		io.close();
		
	}

}