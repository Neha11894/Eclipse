import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetAllRowData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\avni\\TestData.xls");
		FileInputStream io=new FileInputStream(file);
HSSFWorkbook workbook=new HSSFWorkbook(io);
HSSFSheet sheet=workbook.getSheet("Sheet3");
int allRows=sheet.getLastRowNum();
System.out.println(allRows);
HashMap<Integer,ArrayList<String>>sheetData=new HashMap<Integer,ArrayList<String>>();
for(int i=0;i<=allRows;i++)
	
{
	ArrayList<String>rowData=new ArrayList<String>();
	HSSFRow row=sheet.getRow(i);
	short lastcell=row.getLastCellNum();
	for(int j=0;j<lastcell;j++)
	{
		HSSFCell cell=row.getCell(j);
		
		//System.out.print(cell.getStringCellValue());
		rowData.add(cell.getStringCellValue());
		
	}
	sheetData.put(i, rowData);
	
	
}
System.out.println(sheetData);


io.close();



	}

}
