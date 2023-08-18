package com.goumi.designpatterns.decoratorpattern.bufferwriter_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFile();
        bufferedReader_.readFiles(10);

        BufferedReader_ bufferedReader_1 = new BufferedReader_(bufferedReader_);
        bufferedReader_1.readStrings(5);
    }
}