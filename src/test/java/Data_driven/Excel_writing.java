package Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writing {
public static void write_data() throws IOException {
	File f=new File("C:\\Users\\Ashok Ranjani\\Desktop\\Ashok.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("user details").createRow(0).createCell(0).setCellValue("Name");
	wb.getSheet("user details").getRow(0).createCell(1).setCellValue("Login id");
	wb.getSheet("user details").getRow(0).createCell(2).setCellValue("password");
	
	wb.getSheet("user details").createRow(1).createCell(0).setCellValue("Ashok");
	wb.getSheet("user details").getRow(1).createCell(1).setCellValue("GT415");
	wb.getSheet("user details").getRow(1).createCell(2).setCellValue("Greens@123");
	
	wb.getSheet("user details").createRow(2).createCell(0).setCellValue("Shanfaz");
	wb.getSheet("user details").getRow(2).createCell(1).setCellValue("GT416");
	wb.getSheet("user details").getRow(2).createCell(2).setCellValue("Greens@123");
	
	wb.getSheet("user details").createRow(3).createCell(0).setCellValue("Niyaz");
	wb.getSheet("user details").getRow(3).createCell(1).setCellValue("GT417");
	wb.getSheet("user details").getRow(3).createCell(2).setCellValue("Greens@123");
	
	wb.getSheet("user details").createRow(4).createCell(0).setCellValue("Prabhu");
	wb.getSheet("user details").getRow(4).createCell(1).setCellValue("GT418");
	wb.getSheet("user details").getRow(4).createCell(2).setCellValue("Greens@123");
	
	wb.getSheet("user details").createRow(5).createCell(0).setCellValue("Nirmal");
	wb.getSheet("user details").getRow(5).createCell(1).setCellValue("GT419");
	wb.getSheet("user details").getRow(5).createCell(2).setCellValue("Greens@123");
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("write successfully");
}
	public static void main(String[] args) throws IOException {
		write_data();
	}
}
