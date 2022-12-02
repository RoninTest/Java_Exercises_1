package com.ronin;

public abstract class Prices {


    public double calculateCar(double price_car, double special_consumption_tax){

        return price_car+(price_car * special_consumption_tax);
    }

    public abstract double calculateCar(double price_car, double special_consumption_tax, double extra_luxury_tax);
}
