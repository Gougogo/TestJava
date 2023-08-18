package com.goumi.io.homeworks;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework01 {

    @ParameterizedTest
    @CsvSource({"out/mynew.txt"})
    public void isFileExist(String filePath){
        File file = new File(filePath);
        if (file.exists())
            System.out.println("exist");
        else
            System.out.println("not exist");
        System.out.println("test");
    }

    @ParameterizedTest
    @CsvSource({"out/mynew2.txt"})
    public void mkFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("exist");
        }else{
            if(file.createNewFile()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }

        }
    }

    @ParameterizedTest
    @CsvSource({"out/production1"})
    public void mkDirAndFile(String filePath) throws IOException {
        File file = new File(filePath);
        if(file.exists()){
            if (file.isDirectory()) {
                System.out.println("是一个目录");
            }else{
                System.out.println("是一个普通文件");
            }
            System.out.println("exist");
        }else{
            if(file.mkdir()){
                System.out.println("目录创建成功");
                File file1 = new File(file, "hello.txt");
                if (file1.createNewFile()) {
                    System.out.println("文件创建成功");
                }else{
                    System.out.println("文件创建失败");
                }
            }else {
                System.out.println("目录创建失败");
            }
        }
    }
}
