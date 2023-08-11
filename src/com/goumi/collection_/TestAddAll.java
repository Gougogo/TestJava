package com.goumi.collection_;

import java.util.ArrayList;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class TestAddAll {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("asd1");
        arrayList2.add("asd2");
        arrayList2.add("asd3");

        arrayList1.addAll(0, arrayList2);

        System.out.println(arrayList1);

    }
}
