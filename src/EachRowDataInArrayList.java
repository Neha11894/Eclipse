import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EachRowDataInArrayList {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\avni\\TestData.xls");
		FileInputStream io = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(io);
		HSSFSheet sheet = workbook.getSheet("Sheet2");
		int allRows = sheet.getLastRowNum();
		System.out.println("Total Rows: " + allRows);
		
		for(int i=0; i<=allRows; i++) {
			ArrayList<String> rowData = new ArrayList<String>();
			HSSFRow row = sheet.getRow(i);
			short lastCell = row.getLastCellNum();
			for(int j=0; j<lastCell; j++) {
				HSSFCell cell = row.getCell(j);
				//System.out.print(cell.getStringCellValue() + " ");
				rowData.add(cell.getStringCellValue());
			}
			System.out.println(rowData);
			
		}
		
		io.close();

	}

}
