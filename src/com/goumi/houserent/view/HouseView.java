package com.goumi.houserent.view;

import com.goumi.houserent.domain.House;
import com.goumi.houserent.service.HouseService;
import com.goumi.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(3);

    public void mainMenu(){
        do {
            System.out.println("========房屋出租系统菜单=======");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房源");
            System.out.println("\t\t\t4 修改房源");
            System.out.println("\t\t\t5 显示房源");
            System.out.println("\t\t\t6 退出系统");
            System.out.println("请输入选择1-6");
            key = Utility.readChar();

            switch (key){
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    update();
                    break;
                case '5':
                    System.out.println("显示");
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    exit();
                    break;
            }

        }while(loop);
    }

    //根据id修改房屋信息
    public void update(){
        System.out.println("==========修改房屋信息=============");
        System.out.println("============请选择待修改房屋信息(-1表示退出)==============");
        int updateId = Utility.readIntLimit(100);
        if (updateId == -1){
            System.out.println("============你放弃修改房屋信息============");
            return;
        }

        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("==========房屋不存在============");
            return;
        }

        System.out.print("姓名(" + house.getName()+"): ");
        String name = Utility.readString(8, "");
        if (!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话(" + house.getName()+"): ");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getName()+"): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("租金(" + house.getName()+"): ");
        int rent = Utility.readIntLimit(4);
        if (!"".equals(rent)){
            house.setRent(rent);
        }

        System.out.print("状态(" + house.getName()+"): ");
        String state = Utility.readString(3, "");
        if (!"".equals(state)){
            house.setState(state);
        }

        System.out.println("=============修改房屋信息成功============");
    }

    public void findHouse(){
        System.out.println("==========查找房屋信息==============");
        System.out.println("==========请输入要查找的房屋ID==============");
        int findId = Utility.readIntLimit(100);
        House house = houseService.findById(findId);
        if (house != null){
            System.out.println(house);
        }else{
            System.out.println("============没有查找到================");
        }
    }

    //完成退出确认
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    //编写listHouses显示房屋列表
    public void listHouses(){
        System.out.println("=========房屋列表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] lists = houseService.list();
        for (int i = 0; i < lists.length/*&& lists[i] != null*/; i++) {
            if (lists[i] == null)
                continue;

            System.out.println(lists[i]);
        }
        System.out.println("=========显示完毕===========");
    }


    //编写addHouse()接受输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("=========添加房屋===========");
        System.out.println("姓名");
        String name = Utility.readString(10);
        System.out.println("电话");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("租金");
        int rent = Utility.readIntLimit(10);
        System.out.println("状态");
        String state = Utility.readString(10);

        House house = new House(2, name, phone, address, rent, state);
        if(houseService.addHouse(house))
            System.out.println("添加成功");
        else
            System.out.println("添加失败");
    }

    //编写delHouse();删除房屋信息
    public void delHouse(){
        System.out.println("==================删除房屋信息==============");
        System.out.println("========请输入待删除房屋的编号(-1退出)=========");

        int delId = Utility.readIntLimit(1000);
        if(delId == -1){
            System.out.println("==================已放弃删除==============");
            return;
        }
        System.out.println("==================请确认是否删除房屋信息==============");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("=============删除成功==============");
            }else{
                System.out.println("=============删除失败==============");
            }
        }else{
            System.out.println("=============放弃删除==============");
        }

    }
}





























