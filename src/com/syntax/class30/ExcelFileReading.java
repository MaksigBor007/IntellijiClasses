package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path="File/book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //how many rows contain the data in a sheet
        int noOfRows=sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> ExcelData=new ArrayList<>();
        HashMap<String,String> rowData;
        //contains all the key that will use in a map
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i < noOfRows; i++) {
            Row row=sheet.getRow(i);
            rowData=new HashMap<>(); //rowData size 0
            //how many cells contain the data in a row
            int noOfCells=row.getPhysicalNumberOfCells();
            /*
            below loop prints all the data from cells in a single line
             */
            for (int j = 0; j < noOfCells; j++) {
                //headerRow.getCell().toString() will use cell values from row 0 one by one
                //row.getCell(j).toString() getting the data from all
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowData.put(key,value);
            }
            ExcelData.add(rowData);
        }
        System.out.println(ExcelData);

        fileInputStream.close();

    }
}