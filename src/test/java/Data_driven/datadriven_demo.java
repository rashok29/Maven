package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven_demo {

	static File f =new File("C:\\Users\\Ashok Ranjani\\Desktop/Ashok.xlsx");
	public static void particular_data() throws IOException {


	
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	org.apache.poi.ss.usermodel.Sheet s = wb.getSheetAt(1);
	Row row = s.getRow(6);
	Cell cell = row.getCell(1);
	CellType cellType = cell.getCellType();
	System.out.println(cellType);
	if (cellType.equals(CellType.STRING)){
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
        System.out.println(numericCellValue);  
		int i=(int) numericCellValue	;
          System.out.println(i);
	}
}
public static void allData() throws IOException {
    FileInputStream fis1=new FileInputStream(f);
    Workbook wb=new XSSFWorkbook(fis1);
    org.apache.poi.ss.usermodel.Sheet sheetAt = wb.getSheetAt(1);
    int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
    
    for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	for (int j = 0; j < physicalNumberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}
				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
				int i1=(int) numericCellValue;
				}
			}
		}
		
		
    }

public static void datawriting() throws IOException {

	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("Ashok demo").createRow(0).createCell(0).setCellValue("name");
	wb.getSheet("Ashok demo").getRow(0).createCell(1).setCellValue("Age");
	wb.getSheet("Ashok demo").createRow(1).createCell(0).setCellValue("Ashok");
	wb.getSheet("Ashok demo").getRow(1).createCell(1).setCellValue("26");
	wb.getSheet("Ashok demo").createRow(2).createCell(0).setCellValue("Nirmal");
	wb.getSheet("Ashok demo").getRow(2).createCell(1).setCellValue("45");
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("Success");
	
	
}
    
    


public static void main(String[] args) throws IOException {
	particular_data();
   allData();
   datawriting();
}
}
