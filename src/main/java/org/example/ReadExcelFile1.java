package org.example;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile1 {

    private static final DataFormatter formatter = new DataFormatter();

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\manik\\Desktop\\password.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //total number of cols and rows
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        // printing at row 1 col 1
        System.out.println(sheet.getRow(1).getCell(1));
        // printing at row 2 col 2
        System.out.println(sheet.getRow(2).getCell(2));


        //printing table using data formater
        for (int r = 0; r <= rows ; r ++){
            XSSFRow row = sheet.getRow(r);//-- > searching in row 1,2,3,4,5,....

            for (int c = 0 ; c <= cols ; c++)
            {
                XSSFCell col = row.getCell(c);
                String value =    formatter.formatCellValue(col);
                System.out.print("        |        " + value);
            }
            System.out.println();
        }



    }
}
