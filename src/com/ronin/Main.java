package com.ronin;

public class Main {

    public static void main(String[] args) {


        PremiumCars premiumCars1= new PremiumCars("Mercedes","Blue","auto",400);
        premiumCars1.showCarInfo();
        premiumCars1.showCarInsuranceInfo();
        premiumCars1.chooseInsurance();


        System.out.println("******************* Our Normal Cars ***********************");

        NormalCars normalCars1=new NormalCars("Honda/Accord","Red","Manual",300);
        NormalCars normalCars2=new NormalCars("Honda/City","Blue","Manual",220);
        normalCars1.showCarInfo();
        System.out.println("*******************************");
        normalCars2.showCarInfo();

        System.out.println("************* Normal Car Price ******************");
        NormalCars_Price normalCars_price=new NormalCars_Price();
        normalCars_price.calculateCar(33.000,0.10);
        PremiumCars_Price premiumCars_price=new PremiumCars_Price();
        premiumCars_price.calculateCar(120.000,0.50);



    }
}
