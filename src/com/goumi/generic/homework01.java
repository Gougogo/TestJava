package com.goumi.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @version 1.0
 * @auther GouMi
 */
public class homework01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee goumi = new Employee("goumi", 20000, new MyDate("12", "15", "2023"));
        Employee goumi2 = new Employee("goumi", 20000, new MyDate("11", "15", "2023"));
        Employee huni = new Employee("huni", 2000, new MyDate("12", "14", "2023"));
        Employee tom = new Employee("tom", 12000, new MyDate("12", "14", "2023"));
        employees.add(goumi);
        employees.add(huni);
        employees.add(tom);
        employees.add(goumi2);
        //employees.add(new Cat());

        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate o1Birthday = o1.getBirthday();
                MyDate o2Birthday = o2.getBirthday();
                String name = o1.getName();
                String name1 = o2.getName();
                int i = name.compareTo(name1);
                if(i != 0)
                    return i;
                else
                    return o1Birthday.compareTo(o2Birthday);
            }
        });

        System.out.println(employees);

    }
}

class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable{

    private String month;
    private String day;
    private String year;

    public MyDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int yearI = Integer.parseInt(this.year) - Integer.parseInt(((MyDate)o).getYear());
        int monthI = Integer.parseInt(this.month) - Integer.parseInt(((MyDate)o).getMonth());
        int dayI = Integer.parseInt(this.day) - Integer.parseInt(((MyDate)o).getDay());
        if(yearI != 0)
            return -yearI;
        else{
            if(monthI != 0)
                return -monthI;
            else{
                if(dayI != 0)
                    return -dayI;
                else
                    return 0;
            }
        }
    }
}
