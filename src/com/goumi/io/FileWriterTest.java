package com.goumi.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("d:\\filewrite.txt");
        fileWriter.write("asd");
        fileWriter.close();

        String filePath = "d:\\filewrite.txt";
        FileReader fileReader = new FileReader(filePath);
        int data = 0;
        while ((data = fileReader.read()) != -1){
            System.out.println((char) data);
        }

        if (fileReader != null)
            fileReader.close();
    }
}
