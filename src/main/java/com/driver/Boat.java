package com.driver;

public class Boat implements WaterVehicle {
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    public static void main(String[] args){
     Boat ob=new Boat();

     ob.getVehicleName();
        ob.getVehicleCapacity();
    }

}
