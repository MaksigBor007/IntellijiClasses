package com.syntax.review12;

import com.syntax.class30.ConfigReaderDemo;
import com.syntax.utils.ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFiles {

    public static void main(String[] args) {
        //locate of the file project
        //relative path

        String path = "File/Config.properties";
        FileInputStream fileInputStream = null;
        try {
            //create a link between your java program and this file
            fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            ConfigReader.closeFile(fileInputStream);

        }
    }
}
