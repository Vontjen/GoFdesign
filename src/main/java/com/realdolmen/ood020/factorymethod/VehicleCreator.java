package com.realdolmen.ood020.factorymethod;

import javax.swing.*;

public abstract class VehicleCreator {

   public abstract Vehicle createVehicle(JCheckBox[] checkBoxes, int passengers, String registration, int berths, boolean sidecar);

   }



