import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateNewWorkbook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File file=new File("C:Users\\avni\\NewData");
//FileInputStream io=new FileInputStream(file);
HSSFWorkbook workbook=new HSSFWorkbook();
HSSFSheet sheet=workbook.createSheet("Data");
HSSFRow row=sheet.createRow(0);
HSSFCell cell=row.createCell(0);
cell.setCellValue("Java");
HSSFCell cell0=row.createCell(1);
cell0.setCellValue("C++");
FileOutputStream op=new FileOutputStream("C:\\Users\\avni\\DataFromScript.xls");
workbook.write(op);
op.close();

	}

}
