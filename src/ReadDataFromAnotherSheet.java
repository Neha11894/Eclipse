import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromAnotherSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\avni\\TestData.xls");
FileInputStream io=new FileInputStream(file);

HSSFWorkbook workbook=new HSSFWorkbook(io);
HSSFSheet sheet=workbook.getSheet("Sheet2");
HSSFRow row=sheet.getRow(0);
HSSFCell cell=row.getCell(3);
String val=cell.getStringCellValue();
System.out.println(val);
HSSFRow row1=sheet.getRow(1);
HSSFCell cell1=row1.getCell(3);
System.out.println(cell1.getStringCellValue());


HSSFRow row2=sheet.getRow(2);
HSSFCell cell2=row2.getCell(4);
System.out.println(cell2.getStringCellValue());

HSSFCell cell3=row2.getCell(1);
System.out.println(cell3.getStringCellValue());
io.close();


	}

}

