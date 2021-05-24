import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class GetRowData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\avni\\TestData.xls");
		FileInputStream io=new FileInputStream(file);

		HSSFWorkbook workbook=new HSSFWorkbook(io);
		HSSFSheet sheet=workbook.getSheet("Sheet2");
		HSSFRow row=sheet.getRow(1);
		short lastcell=row.getLastCellNum();
		System.out.println(lastcell);
		for(int i=0;i<lastcell;i++)
		{	
			HSSFCell cell=row.getCell(i);
			
			if(cell.getCellType()==CellType.NUMERIC)
			{
				System.out.println(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==CellType.STRING) {
				System.out.println(cell.getStringCellValue());	
			}
		io.close();		}
		}

}
