package Activities;

import java.util.Scanner;
/*
**
@author Prajwal Krishna
**
 */

public class Register {
/*
 This is class Register's main method.
 prompts the user to input charge and payment values
 Main method calls calculateDollarAndCents.
 */

    public static void main(String[] args){
        float charge,payment;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of the item:");
        charge = scan.nextFloat();

        System.out.println("Enter the amount given by customer:");
        payment = scan.nextFloat();

        String result="";
        result = calculateDollarAndCents(charge,payment);

        System.out.println(result);
    }


    public static String calculateDollarAndCents(float charge,float payment){
        /*
        method calculateDollarAndCents
        this method takes 2 float parameters and checks for dollars less than/greater than 1 and also the same for cents
         */

        String stmt = "";

        if(payment < charge){
            return ("There are no discounts today! ");
        }

        float change = payment - charge;
        String changeToStr = String.format("%.2f",change);
        String splitChangeToStr[] = changeToStr.split("\\.");

        int dollars = Integer.parseInt(splitChangeToStr[0]);
        float cents = Float.parseFloat (splitChangeToStr[1]);

//        System.out.println(change);
//        System.out.println(dollars);
//        System.out.println(cents);




        if (dollars > 1 && cents > 1)
            stmt = "your change is "+(dollars)+" dollars and "+(cents)+" cents";
        else if (dollars > 1 && cents <= 1)
            stmt = "your change is "+(dollars)+" dollars and "+(cents)+" cent";
        else if(dollars <= 1 && cents > 1)
            stmt = "your change is "+(dollars)+" dollar and "+(cents)+" cents";
        else
            stmt = "your change is "+(dollars)+" dollar and "+(cents)+" cent";

        return stmt;


    }
}
//end of class Register
