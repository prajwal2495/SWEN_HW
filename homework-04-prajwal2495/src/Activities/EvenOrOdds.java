package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

//class EvenOrOdds begins

public class EvenOrOdds {

    /*
    Main method :
    prompts the user to enter a number
    calculates whether given number is prime or not using do-while
     */
    public static void main(String[] args){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 to terminate the loop");
        do{
            System.out.println("\nEnter a number");
            number = scan.nextInt();
            if(number % 2 ==0) {
                System.out.println("Even.");
            }
            else {
                System.out.println("Odd.");
            }
        }while(number != 0);
        System.out.println("\nDone!");
    }
}
// end of class EvenOrOdds