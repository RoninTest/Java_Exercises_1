package com.ronin;

public class Main {

    public static void main(String[] args) {


        PremiumCars premiumCars1=new PremiumCars("Mercedes","Blue","auto",400);
        premiumCars1.chooseInsurance();
        premiumCars1.showCarInfo();

        System.out.println("****************************************************");

        NormalCars normalCars=new NormalCars("Honda","Red","normal",150);
        normalCars.showCarInfo();

    }
}
