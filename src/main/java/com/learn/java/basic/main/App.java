package com.learn.java.basic.main;

import com.learn.java.basic.entity.AirConditioner;
import com.learn.java.basic.entity.Toaster;
import com.learn.java.basic.entity.WashingMachine;
import com.learn.java.basic.logic.ApplianceLogic;

public class App {
    public static void main(String[] args) {

        ApplianceLogic applianceLogic = new ApplianceLogic();

        applianceLogic.addAppliance(new AirConditioner(450, "Huawei", "Home", 40, "Split system"));
        applianceLogic.addAppliance(new AirConditioner(250, "LG", "Home", 25, "Portable"));
        applianceLogic.addAppliance(new AirConditioner(1750, "Mitsubishi", "Office", 550, "Industrial"));

        applianceLogic.addAppliance(new WashingMachine(250, "Atlant", "Home", 4, 1200));
        applianceLogic.addAppliance(new WashingMachine(350, "Indesit", "Home", 6, 1800));
        applianceLogic.addAppliance(new WashingMachine(550, "Bosch", "Home", 6, 2200));
        applianceLogic.addAppliance(new WashingMachine(980, "Danube", "Laundry", 15, 2700));

        applianceLogic.addAppliance(new Toaster(50, "Bosch", "Home", 2));
        applianceLogic.addAppliance(new Toaster(120, "Bosch", "Home", 4));
        applianceLogic.addAppliance(new Toaster(180, "Cuisinart", "Home", 4));

        System.out.println(applianceLogic.getAppliances());

        System.out.println(applianceLogic.getAppliances().contains(new Toaster(50, "Bosch", "Home", 2)));

        System.out.println(applianceLogic.searchByPrice(10, 120));
    }
}
