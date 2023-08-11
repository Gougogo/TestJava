package com.goumi.collection_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TestStaff {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        Staff staff1 = new Staff("张三", "1", 10000.0);

        map.put(staff1.getStaffId(), staff1);

        //map.put(4, "苟秘傻屌");

        //遍历方式4：keySet的增强for循环遍历
        Set set1 = map.keySet();
        for (Object key : set1) {
            if(map.get(key) instanceof Staff) {
                Staff staff = (Staff) map.get(key);
                System.out.println(staff.toString());
            }else {
                throw new RuntimeException("类型不匹配");
            }
        }
    }
}


