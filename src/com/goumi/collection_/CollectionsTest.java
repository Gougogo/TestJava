package com.goumi.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Object> src = new ArrayList<>(100);
        src.add("asd");
        src.add("asd");
        src.add("asd");
        src.add("asd");

        List des = new ArrayList<>(100);

        Collections.copy(des, src);
    }
}
