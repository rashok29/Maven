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

public class datadriven_using_inproject {
	public static String Value;
	private static String read_data(String path, int RowIndex,int columIndex) throws IOException {
		File f =new File(path);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(1);
		Row row = sheetAt.getRow(RowIndex);
		Cell cell = row.getCell(columIndex);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			Value = cell.getStringCellValue();
			System.out.println(Value);

		}else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data=(int) numericCellValue;
			Value = String.valueOf(data);
			System.out.println(data);
		}wb.close();
	return Value;
	}
	
	}

