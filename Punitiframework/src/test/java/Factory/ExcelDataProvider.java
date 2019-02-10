package Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider() {
		try {
			wb = new XSSFWorkbook(new FileInputStream(
					new File(System.getProperty("user.dir") + "/Datafiles/Credentials.xlsx")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ExcelDataProvider(String pathofexcel) {
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File("pathofexcel")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();

	}

	public int getIntegerData(String sheetname, int row, int column) {
		return (int) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();

	}

	public double getdoubleData(String sheetname, int row, int column) {
		return (double) wb.getSheet("sheetname").getRow(row).getCell(column).getNumericCellValue();
	}

}