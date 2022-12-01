package com.ronin;


import java.util.Scanner;

public class PremiumCars extends Cars{

    private boolean insurance;

    public boolean chooseInsurance(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type your insurance choose Y/N : ");
        String client_insurance_choose= scanner.next();

        if (client_insurance_choose.equals("Y")){
            System.out.println("Thank you , you have %10 discount");
            return insurance = true;

        }else if (client_insurance_choose.equals("N")) {
            System.out.println("Thank you, you didn't choose insurance. You don't have a discount.");
            return insurance = false;
        }
        else {
            System.out.println("Please , enter a Y/N");
            return insurance=false;
        }

    }


    public PremiumCars(String brand, String color, String gearbox, int top_speed) {
        super(brand, color, gearbox, top_speed);

    }


    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("Your insurance choose : " + insurance);
    }

    }

