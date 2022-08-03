package com.syntax.hometasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HTWithProperties {
    //Create a property file to store following configurations:
    //browser=chrome
    //url=https://facebook.com
    //username
    //password
    //Read file and extract values of browser & url

    public static void main(String[] args) throws IOException {

        String path="File/FaceBook.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String browser=properties.getProperty("browser");
        String url1=properties.getProperty("url");
        System.out.println(browser+" "+url1);

        fileInputStream.close();


    }
}
