package com.goumi.regex_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 1.0
 * @auther GouMi
 */
public class RegexTest {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\[");
        Matcher matcher = compile.matcher("asd]");
        while (matcher.find()){
            System.out.println("ok");
        }
        System.out.println(matcher.matches());
    }
}
