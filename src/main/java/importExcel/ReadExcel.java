package importExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	public static void main(String[] args) {
		readXLSXFile("Link dan den file ex");
	}
	
	private static void readXLSXFile(String file) {
		try {
			XSSFWorkbook work = new XSSFWorkbook(new FileInputStream(file));
		
			XSSFSheet sheet = work.getSheet("");
			XSSFRow row;
			
			int i = 0;
			while ((row = sheet.getRow(i)) != null) {
				System.out.println("Cust id:: " + row.getCell(0).getNumericCellValue());
				System.out.println("Cust name:: " + row.getCell(1).getNumericCellValue());
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
