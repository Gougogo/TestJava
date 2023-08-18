package com.goumi.io;

/**
 * @version 1.0
 * @auther GouMi
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class FilePerssions {
    public static void main(String[] args) {
        Path filePath = Paths.get("D:\\output\\testFlowBean\\part-r-00000");
        try {
            DosFileAttributes attributes = Files.readAttributes(filePath, DosFileAttributes.class);
            System.out.println("File Permissions: " + attributes.isReadOnly());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
