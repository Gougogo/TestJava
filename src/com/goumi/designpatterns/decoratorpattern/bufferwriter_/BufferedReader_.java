package com.goumi.designpatterns.decoratorpattern.bufferwriter_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class BufferedReader_ extends Reader_{
    private Reader_ reader;

    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }

    public Reader_ getReader() {
        return reader;
    }

    public void setReader(Reader_ reader) {
        this.reader = reader;
    }

    public void readFile(){
        reader.readFile();
    }

    //扩展读取文件的功能
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader.readFile();
        }
    }

    public void readString(){
        reader.readString();
    }

    //扩展读取字符串的功能
    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader.readString();
        }
    }
}
