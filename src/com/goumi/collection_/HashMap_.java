package com.goumi.collection_;

import java.util.*;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class HashMap_ {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(null, "asd");
        map.put("java", 10);
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");
        map.put("no1", "张三丰");


        Set<Object> keySet = map.keySet();
        for (Object key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }

        Iterator<Object> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }

        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry entry1 = (Map.Entry) entry;
            entry1.getKey();
        }

        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object entry = iterator1.next();
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey());
        }


        Staff staff = new Staff("s", "1", 12);
        System.out.println(staff.staffId);


    }
}


































