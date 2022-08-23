package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_demo {
private static void readdata() throws IOException {
	File f=new File("C:\\Users\\Ashok Ranjani\\Desktop\\Nrimal.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("sample");
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheet.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j <physicalNumberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);}
				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int ref=(int) numericCellValue;
					System.out.println(ref);
				} 
		
				
		}}
			}
				
			
		public static void main(String[] args) throws IOException {
			readdata();
		}
		
	
	}
		
	
	
	

