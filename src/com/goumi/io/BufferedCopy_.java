package com.goumi.io;

import java.io.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "D:\\filewrite.txt";
        String destFilePath = "D:\\new6.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            while ((line = br.readLine()) != null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null && bw != null){
                    bw.close();
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
