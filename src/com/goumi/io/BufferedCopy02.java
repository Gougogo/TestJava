package com.goumi.io;

import java.io.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "D:\\filewrite.txt";
        String destFilePath = "D:\\goumi.txt";
        BufferedInputStream bis = null;
        BufferedOutputStream bot = null;
        int copyLength = 1024;
        byte[] bytes = new byte[copyLength];
        int readLen = 0;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bot = new BufferedOutputStream(new FileOutputStream(destFilePath));

            while ((readLen = bis.read(bytes, 0, copyLength)) != -1) {
                System.out.println("读取成功");
                bot.write(bytes, 0, readLen);
            }

        } catch (IOException e) {
            System.out.println("读取失败");
        } finally {
            if (bis != null && bot != null){
                try {
                    bis.close();
                    bot.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
