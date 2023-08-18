package com.goumi.io;

import net.mindview.atunit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @auther GouMi
 * 单个字节的读取
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\newasd.txt");
        FileInputStream fileInputStream = null;
        try {
            file.createNewFile();
            fileInputStream = new FileInputStream(file);

            int readData = 0;
            byte b[]= new byte[5];
            while ((readData = fileInputStream.read(b)) != -1){
                System.out.print(readData);
                String s = new String(b);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }

    @Test
    public void writeFile(){
        System.out.println("asdasd");
    }
}
