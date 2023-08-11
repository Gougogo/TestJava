package com.goumi.houserent.service;


import com.goumi.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 0;
    private int idCounter = 2;

    public HouseService(int size){
        houses = new House[size];

        houses[0] = new House(1, "a", "136", "四川", 400, "未出租");
        houses[2] = new House(2, "a", "136", "四川", 400, "未出租");
        houseNums = 2;
    }

    //list方法，返回house信息
    public House[] list(){
        return houses;
    }

    public boolean addHouse(House newHouse){
        if (houseNums == houses.length){
            System.out.println("数组已满，不能再添加！");
            return false;
        }

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                houses[i] = newHouse;
                houseNums++;
            }
        }

        newHouse.setId(++idCounter);

        return true;
    }

    //删除房屋信息
    public boolean del(int delId){
        int index = -1;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null && houses[i].getId() == delId) {
                index = i;
            }
        }

        if (index == -1)
            return false;

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }

        houses[--houseNums] = null;

        return true;
    }

    //find方法，返回House对象，或者null
    public House findById(int findId){
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] != null && houses[i].getId() == findId)
                return houses[i];
        }
        return null;
    }
}
