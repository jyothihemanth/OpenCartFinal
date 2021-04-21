/**
 * Name: ExcelUtils
 * Created By: Jyothi, Dikhit
 * Date: 19/04/2021
 * Description: This class contains all data reading methods from Excel file
 */
package com.application.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.application.basePackage.BaseClass;

public class ExcelUtils extends BaseClass {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public  ExcelUtils(String excelPath , String sheetName) {
		try {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		getRoCount();
		getCellDataString(0,0);
		getCellDataNumeric(0,1);
	}
/**
 * Created: Dikhit, Jyothi
 * Date: 19/04/2021
 * Description: This method is used to get Row count from Excel Sheet
 * @return
 */
	public static int getRoCount() {
		int rowCount=0;
		try {
			 rowCount= sheet.getPhysicalNumberOfRows();
//			System.out.println("Rou count is : "+rowCount);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return rowCount;
	}
	
	/**
	 * Created: Dikhit, Jyothi
	 * Date: 19/04/2021
	 * Description: This method is used to get Coloumn count from Excel Sheet
	 * @return
	 */
	public static int getColCount() {
		int colCount=0;
		try {
			 colCount= sheet.getRow(0).getPhysicalNumberOfCells();
//			System.out.println("Rou count is : "+colCount);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return colCount;
	}

	/**
	 * Created: Dikhit, Jyothi
	 * Date: 19/04/2021
	 * Description: This method is used to get String Cell Data  from Excel Sheet
	 * @return
	 */
	public static String getCellDataString(int rowNum , int colNum) {
		String cellData = null;
		try {

			 cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//			System.out.println("Cell Data is : "+cellData);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return cellData;

	}
	
	/**
	 * Created: Dikhit, Jyothi
	 * Date: 19/04/2021
	 * Description: This method is used to get Numeric Cell Data from Excel Sheet
	 * @return
	 */
	public static void getCellDataNumeric(int rowNum , int colNum) {
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//			System.out.println("Cell Data is : "+cellData);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}

	}

}
