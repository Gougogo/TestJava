package com.goumi.homeworks;

import com.goumi.houserent.service.HouseService;

/**
 * @version 1.0
 * @auther GouMi
 */
public class Homework04 {
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("骑马");
    }
}

class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("渡船");
    }
}

class VehicleFactory{

    private VehicleFactory(){

    }

    private static final Horse horse = new Horse();

    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }
}

class Person01{
    private String name;
    private Vehicles vehicles;

    public Person01(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        if (!(vehicles instanceof Boat))
            vehicles = VehicleFactory.getBoat();
        vehicles.work();
    }

    public void normalUse(){
        if (!(vehicles instanceof Horse))
            vehicles = VehicleFactory.getHorse();
        vehicles.work();
    }


}
