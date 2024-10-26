package demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	public static void main(String[] args) throws Throwable {

		// Give the path
		FileInputStream fis = new FileInputStream("./Data/GoIbiboTC.xlsx");
		// Take the control of Workbook
		Workbook wb = WorkbookFactory.create(fis);
		// Take the control of sheet
		Sheet sheet = wb.getSheet("Sheet3");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}

	}

}
