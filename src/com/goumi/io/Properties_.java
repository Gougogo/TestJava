package com.goumi.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("test", "苟秘");

        String filePath = "out/propertiestest.txt";
        //properties.store(new BufferedWriter(new FileWriter(filePath)), "苟秘的测试");
        properties.store(new FileOutputStream(filePath), "苟秘的测试");
    }
}
