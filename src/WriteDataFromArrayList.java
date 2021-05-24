import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteDataFromArrayList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ArrayList<String>Language=new ArrayList<String>();
Language.add("Java");
Language.add("C");
Language.add("C++");
Language.add("DS");
Language.add("Cobol");
HSSFWorkbook workbook=new HSSFWorkbook();
HSSFSheet sheet=workbook.createSheet("Sheet1");
HSSFRow row=sheet.createRow(0);
for(int i=0; i<Language.size(); i++) {
	HSSFCell cell = row.createCell(i);
	cell.setCellValue(Language.get(i));
	FileOutputStream op = new FileOutputStream("C:\\Users\\avni\\Language.xls");
	workbook.write(op);
	op.close();
}

	}

}
