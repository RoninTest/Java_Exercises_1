package com.ronin;


import java.util.Scanner;

public class PremiumCars extends Cars{

    private boolean insurance;




    public PremiumCars(String brand, String color, String gearbox, int top_speed) {
        super(brand, color, gearbox, top_speed);

    }

    public void chooseInsurance(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type your insurance choose Y/N : ");
        String client_insurance_choose= scanner.next();

        if (client_insurance_choose.equals("Y")){
            System.out.println("Thank you , you have %10 discount");
            insurance = true;

        }else if (client_insurance_choose.equals("N")) {
            System.out.println("Thank you, you didn't choose insurance. You don't have a discount.");
            insurance = false;

            System.out.println("You can have to insurance your luxury car. You can choose Normal Status car : ");
            NormalCars normalCars=new NormalCars("Honda","White or Blue","Manual",220);
            normalCars.showCarInfo();
        }
        else {
            System.out.println("Please , enter a Y/N");
            insurance = false;
        }

    }


    @Override
    public void showCarInfo() {
        super.showCarInfo();

    }

    public void showCarInsuranceInfo(){
        System.out.println("Do you want to insurance to your car ? "
                + "First selecting : " + insurance);
    }

    }

