package com.goumi.io;

import java.io.FileWriter;

public class GenerateFileWithManyLines {
    public static void main(String[] args) {
        String filepath = "data/generateFile.txt";
        int lines = 1000;
        String content = "1,laoduan,38,99.99\r\n";

        try(FileWriter fileWriter = new FileWriter(filepath)) {
            for(int i = 0; i < lines; ++i){
                fileWriter.append(content);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
