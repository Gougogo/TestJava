package com.goumi.collection_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        double checkSalary = 18000;

        Staff staff1 = new Staff("张三", "1", 10000.0);
        Staff staff2 = new Staff("李四", "2", 20000.0);
        Staff staff3 = new Staff("王五", "3", 30000.0);

        map.put(staff1.getStaffId(), staff1);
        map.put(staff2.getStaffId(), staff2);
        map.put(staff3.getStaffId(), staff3);

        //map.put(4, "苟秘傻屌");

        //遍历方式1：entrySet的迭代器遍历
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object entry = iterator.next();
            Map.Entry entry1 = (Map.Entry) entry;
            if (entry1.getValue() instanceof Staff) {
                Staff staff = (Staff) entry1.getValue();
                if(staff.getSalary() > checkSalary){
                    System.out.println(staff.toString());
                }
            }else{
                throw new RuntimeException("类型不匹配");
            }
        }

        //遍历方式2：entrySet的增强for循环
        Set entrySet1 = map.entrySet();
        for (Object entry : entrySet1) {
            Map.Entry entry1 = (Map.Entry) entry;
            if (entry1.getValue() instanceof Staff) {
                Staff staff = (Staff) entry1.getValue();
                if(staff.getSalary() > checkSalary){
                    System.out.println(staff.toString());
                }
            }else{
                throw new RuntimeException("类型不匹配");
            }
        }

        //遍历方式3：keySet的迭代器遍历
        Set set = map.keySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Object key = iterator1.next();
            if (map.get(key) instanceof Staff) {
                Staff staff = (Staff) map.get(key);
                if (staff.getSalary() > checkSalary) {
                    System.out.println(staff.toString());
                }
            }else{
                throw new RuntimeException("类型不匹配");
            }
        }

        //遍历方式4：keySet的增强for循环遍历
        Set set1 = map.keySet();
        for (Object key : set1) {
            if (map.get(key) instanceof Staff) {
                Staff staff = (Staff) map.get(key);
                if(staff.getSalary() > checkSalary){
                    System.out.println(staff.toString());
                }
            }else{
                throw new RuntimeException("类型不匹配");
            }
        }

    }
}

class Staff{
    String name;
    String staffId;
    double salary;

    public Staff(String name, String staffId, double salary) {
        this.name = name;
        this.staffId = staffId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getStaffId() {
        return staffId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", staffId='" + staffId + '\'' +
                ", salary=" + salary +
                '}';
    }
}






