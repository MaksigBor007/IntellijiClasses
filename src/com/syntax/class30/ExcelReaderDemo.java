package com.syntax.class30;

import com.syntax.utils.ExcelReader;
import com.syntax.utils.Constants;
import org.apache.commons.math3.analysis.function.Constant;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {
List<Map<String,String>> excelData= ExcelReader.read(Constants.ExcelFilePath);
Map<String,String> firstRow=excelData.get(0);
        System.out.println(firstRow.get("FirstName"));
        System.out.println(firstRow.get("Age"));
        for(Map<String,String> row:excelData){
            for(Map.Entry<String,String> entry: row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue() );
            }
            System.out.println("********************");
        }

    }
}
