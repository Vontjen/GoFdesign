package com.realdolmen.ood020.factorymethod;


import javax.swing.*;

public class VehicleCreatorImpl extends VehicleCreator {



    @Override
    public Vehicle createVehicle(JCheckBox[] checkBoxes, int passengers, String registration, int berths, boolean sidecar) {
        Vehicle v;
        if (checkBoxes[1].isSelected()){
            v= new Truck(passengers,registration,berths);
        }
        else if (checkBoxes[0].isSelected()) {
            v = new Vehicle(passengers,registration);

        }
        else {
            v= new Bike(passengers,registration,sidecar);
        }


        return v;
    }
}
