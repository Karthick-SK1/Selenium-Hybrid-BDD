package testCases.selenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataDriven {

    public DataDriven() throws FileNotFoundException {
    }

    public static void main(String[] args) throws Exception {

        /*
         * To Read the Data from the Excel File
         */

        FileInputStream file = new FileInputStream("C://My_Projects//Selenium_IntelliJ//Selenium//src//test//resources//meta-data//Files//file_example_XLSX_10.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get the Sheet by Sheet Name
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        //To Get the Total Number of Rows in the Sheet
        int totalRows = sheet.getLastRowNum();

        int totalCells = sheet.getRow(1).getLastCellNum();

        for (int i = 0; i < totalRows; i++) {
            XSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < totalCells; j++) {
                String value = rows.getCell(j).toString();
                System.out.print(" " + value);
            }
            System.out.println();
        }
    }
}