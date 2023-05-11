package org.example;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class ReadExcelFromCols2_4_7 {

    private static DataFormatter formatter = new DataFormatter();

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\manik\\Desktop\\password.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);








    int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        //printing values from 2, 4, 5 cells

        //col 2
        for (int r = 0 ; r <= rows ; r ++ ){
            XSSFRow ros =  sheet.getRow(r);
            XSSFCell cell = ros.getCell(2);

            String value = formatter.formatCellValue(cell);
            System.out.println(value);
            System.out.print(" | ");
        }


        for (int r = 0 ; r <= rows ; r ++ ){
            XSSFRow ros =  sheet.getRow(r);
            XSSFCell cell = ros.getCell(4);

            String value = formatter.formatCellValue(cell);
            System.out.println(value);
            System.out.print(" | ");
        }






    }

}
