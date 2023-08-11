package com.goumi.generic;

import java.util.*;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework02 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>(new Hashtable<>());
        //DAO<User> userDAO = new DAO<>();
        userDAO.save("1", new User(1, 11, "goumi"));
        userDAO.save("2", new User(2, 12, "huni"));
        userDAO.save("3", new User(3, 13, "hani"));
        userDAO.save("4", new User(4, 14, "jimi"));

        List<User> list = userDAO.list();
        for (User user : list) {
            System.out.println(user);
        }

        User user = userDAO.get("2");
        System.out.println(user);

        userDAO.update("4", new User(5, 15, "hsp"));
        userDAO.delete("4");
    }
}

class DAO<T>{
    Map<String, T> map;

    public DAO() {
        this.map = new HashMap<>();
    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity){
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        Set<String> keys = map.keySet();
        if(keys.contains(id))
            map.put(id, entity);
    }

    public List<T> list(){
        Collection<T> values = map.values();
        return new ArrayList<>(values);
    }

    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
