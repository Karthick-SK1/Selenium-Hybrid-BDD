package testCases.selenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) throws IOException {
        FileOutputStream newfile = new FileOutputStream("C://My_Projects//Selenium_IntelliJ//Selenium//src//test//resources//meta-data//Files//file_example_XLSX_10.xlsx");

        XSSFWorkbook newWorkBook = new XSSFWorkbook();
        XSSFSheet newSheet = newWorkBook.createSheet("NewBook");
        for (int row = 0; row < 10; row++) {
            XSSFRow newRow = newSheet.createRow(row);
            for (int values = 0; values < 10; values++) {
                newRow.createCell(values).setCellValue("I love You Shahina");
            }
        }
        newWorkBook.write(newfile);
        newfile.close();
        System.out.println("Data has been Created Successfully");
    }
}

