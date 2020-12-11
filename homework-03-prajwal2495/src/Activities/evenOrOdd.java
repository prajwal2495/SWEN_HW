package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

public class evenOrOdd {

    /*
    main method of class evenOrOdd
    prompts user to enter an integer number to find out whether it is even or odd
    calls calculateEvenOrOdd to find out whether it is even or odd
     */
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = scan.nextInt();

        calculateEvenOrOdd(number);
    }

    public static void calculateEvenOrOdd(int n)
    {
        /*
        calculateEvenOrOdd method
        calculates whether the number is odd or even and also whether the number is divisible by 5 or not
         */
        if(n % 5 == 0)
            System.out.println("It is divisible by 5");
        else
            System.out.println("It is not divisible by 5");
        if(n % 2 == 0)
            System.out.println("it is an even number");
        else
            System.out.println("It is an odd number");
    }
}
