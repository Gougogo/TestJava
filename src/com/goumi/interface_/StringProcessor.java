package com.goumi.interface_;

import java.util.Arrays;

/**
 * @version 1.0
 * @auther GouMi
 */

interface ProcessorInterface{
    String name();

    Object process(Object input);
}

class Apply_1 {
    public static void process(ProcessorInterface p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

public abstract class StringProcessor implements ProcessorInterface {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static void main(String[] args) {
        Apply_1.process(new Splitter_1(), "I am goumi.");
    }
}

class Upcase_1 extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase_1 extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter_1 extends StringProcessor{

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}