package com.goumi.collection_.homework;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework01 {
    public static void main(String[] args) {

    }
}

class News{
    String title;
    String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
