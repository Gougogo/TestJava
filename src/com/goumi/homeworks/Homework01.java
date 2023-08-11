package com.goumi.homeworks;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[8];
        persons[0] = new Person("Marry", 10, "PHP工程师");
        persons[1] = new Person("Tom", 50, "大数据工程师");
        persons[2] = new Person("Smith", 20, "Java工程师");
        persons[3] = new Person("Smith", 65, "Java工程师");
        persons[4] = new Person("Smith", 44, "Java工程师");
        persons[5] = new Person("Smith", 34, "Java工程师");
        persons[6] = new Person("Smith", 12, "Java工程师");
        persons[7] = new Person("Smith", 38, "Java工程师");

        //输出当前对象数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认对象的.toString()
        }

        Person tmp = null;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length-i-1; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }

        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认对象的.toString()
        }
    }
}

    /*
    定义一个Person类 {name, age, job}, 初始化Person 对象数组，有3个person对象，
    并按照 age 从 大到 小进行排序, 提示，使用冒泡排序
     */

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
