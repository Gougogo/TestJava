package com.goumi.collection_;

import java.util.ArrayList;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Collection_ {
    public static void main(String[] args) {
        ArrayList lists = new ArrayList();
        lists.add(15);
        lists.add("asd");
        lists.add(true);
        lists.add('a');
        for (Object list : lists) {
            System.out.println(list);
        }

        /*lists.remove("asd");
        System.out.println(lists);
        lists.remove(0);
        System.out.println(lists);

        System.out.println(lists.contains("a"));*/

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("qwe");
        list2.add("asd");

        lists.addAll(list2);
        System.out.println(lists);
        lists.removeAll(list2);
        System.out.println(lists);

        System.out.println(lists.isEmpty());
        lists.clear();
        System.out.println(lists);

        System.out.println(list2.size());


    }
}
