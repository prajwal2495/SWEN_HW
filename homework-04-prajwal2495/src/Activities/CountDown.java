package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class CountDown begins
public class CountDown {

    /*
    Main method:
    prompts the user to enter a number
    and counts down i.e., N - 0
     */
    public static void main(String[] args){
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        number = scan.nextInt();

        while(number >= 0){
            System.out.println(number);
            number = number - 1;
        }
    }
}
// end of class CountDown