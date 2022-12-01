package com.ronin;

public class Cars {
    final String brand;
    final String color;
    final String gearbox;
    final int top_speed;

    public Cars(String brand, String color, String gearbox, int top_speed) {
        this.brand = brand;
        this.color = color;
        this.gearbox = gearbox;
        this.top_speed = top_speed;
    }

    public void showCarInfo(){
        System.out.println("The car brand : " + brand);
        System.out.println("The car color : " + color);
        System.out.println("The car gearbox : " + gearbox);
        System.out.println("The car top speed : " + top_speed);
    }
}
