package com.ronin;


public class NormalCars_Price extends Prices{

    @Override
    public double calculateCar(double price_car, double special_consumption_tax) {
        double normal_car_price = price_car+(price_car * special_consumption_tax);
        System.out.println("Normal Car price : " + normal_car_price );

        return super.calculateCar(price_car,special_consumption_tax);
    }
}
