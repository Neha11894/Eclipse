import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetRowDataAndCreateList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\avni\\TestData.xls");
		FileInputStream io=new FileInputStream(file);

		HSSFWorkbook workbook=new HSSFWorkbook(io);
		HSSFSheet sheet=workbook.getSheet("Sheet2");
		HSSFRow row=sheet.getRow(0);
		short lastcell=row.getLastCellNum();
		System.out.println(lastcell);
		ArrayList<String>cellValues=new ArrayList<String>();
		
		
		
		
		for (int i=0;i<lastcell;i++)
		{
			HSSFCell cell=row.getCell(i);
			cellValues.add(cell.getStringCellValue());
		}
		System.out.println(cellValues);
		io.close();
	}

}
