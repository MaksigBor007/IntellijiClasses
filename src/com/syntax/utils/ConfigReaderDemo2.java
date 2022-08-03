package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ConfigReaderDemo2 {

    public static void main(String[] args) throws FileNotFoundException {
        String path="File/Config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);

    }
}
