package com.realdolmen.ood020.factorymethod;

public class TruckFactory extends VehicleCreator {


    @Override
    public Vehicle createVehicle(VehicleTypes type, int passengers, String registration, int berths) {
        Vehicle v;
        if (type == VehicleTypes.truck){
            v= new Truck(passengers,registration,berths);
        }
        else {
            v = new Vehicle(passengers,registration);

        }

        return v;
    }
}
