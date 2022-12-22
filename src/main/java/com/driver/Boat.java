package com.driver;


public class Boat implements WaterVehicle {
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }
    String name;
    int capacity;
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }



}
