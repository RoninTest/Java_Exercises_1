package com.ronin;

public class PremiumCars_Price extends Prices{

    private double extra_luxury_tax;
    @Override
    public double calculateCar(double price_car, double special_consumption_tax,double extra_luxury_tax) {
        this.extra_luxury_tax=extra_luxury_tax;
        double premium_car_price=(price_car+(price_car*special_consumption_tax)+(price_car*extra_luxury_tax));
        System.out.println("Your car price : " + premium_car_price);
        return super.calculateCar(price_car, special_consumption_tax);




    }
}
