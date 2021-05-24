import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData1 {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\avni\\TestData.xls");
FileInputStream io=new FileInputStream(file);
HSSFWorkbook workbook=new HSSFWorkbook(io);
HSSFSheet sheet=workbook.getSheet("Sheet1");	
HSSFRow row=sheet.getRow(4);
HSSFCell col=row.getCell(5);


HSSFCell col1=row.getCell(8);
System.out.println(col1.getStringCellValue());

String val=col.getStringCellValue();
System.out.println(val);
io.close();
	}

}
