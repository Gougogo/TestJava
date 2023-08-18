package com.goumi.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class FileWriter01 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("d://test002.txt");
            fileWriter.write('1');
            char[] chars = {'a', 'b', 'c'};

            fileWriter.write(chars);

            fileWriter.write("goumi".toCharArray(), 0, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null)
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
        }
    }
}
