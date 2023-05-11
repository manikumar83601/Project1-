package org.example;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtility {

    public FileInputStream inputStream;
    FileOutputStream outputStream;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path = null;

    ExcelUtility (String path){
        this.path=path;
    }

    //----------------------------------------------------------------

    public int totalrows(String SheetName) throws IOException {
        inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(SheetName);
        int rowcount = sheet.getLastRowNum();
        workbook.close();
        inputStream.close();
        return rowcount;
        }


    //----------------------------------------------------------------

    public int totalcell(String SheetName , int rownum) throws IOException {
        inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(SheetName);
        row = sheet.getRow(rownum);
        int totalcell = row.getLastCellNum();               // sheet.getRow(rownum).getLAstCellNum();
        workbook.close();
        inputStream.close();
        return totalcell;
    }


    //----------------------------------------------------------------

// print particular cell data
    public String   readcelldata (String SheetName, int rownum, int cellnum) throws IOException {
        inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(SheetName);
        row = sheet.getRow(rownum);
        cell = row.getCell(cellnum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try {
            data = formatter.formatCellValue(cell);
        }
        catch (Exception e ){
            data ="";
        }

        workbook.close();
        inputStream.close();
        return data;
    }


    //----------------------------------------------------------------

    //writing data into cell
    public void setcellvalue (String SheetName, int rownum, int cellnum, String data) throws IOException {
        inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet(SheetName);

        row = sheet.getRow(rownum);
        cell = row.getCell(cellnum);
        cell.setCellValue(data);

        outputStream = new FileOutputStream(path);
        workbook.close();
        inputStream.close();
        outputStream.close();
    }


    //----------------------------------------------------------------

}
