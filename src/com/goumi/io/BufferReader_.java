package com.goumi.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BufferReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\input\\wordcount\\hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
