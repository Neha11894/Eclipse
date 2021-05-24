import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteDataToExistingRow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\avni\\TestData.xls");
FileInputStream io=new FileInputStream(file);

HSSFWorkbook workbook=new HSSFWorkbook(io);
HSSFSheet sheet=workbook.getSheet("Sheet2");
HSSFRow row=sheet.getRow(1);
short lastCell=row.getLastCellNum();
System.out.println(lastCell);
HSSFCell cell=row.createCell(lastCell);
cell.setCellValue("Extract");
HSSFRow row0 = sheet.getRow(0);
short lastCell0 = row0.getLastCellNum();

HSSFCell cell0 = row0.createCell(lastCell0);
cell0.setCellValue(1000);
FileOutputStream op=new FileOutputStream(file);
workbook.write(op);

op.close();
io.close();

	}

}
