package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class CountingUp begins
public class CountingUp {

    /*
    Main method:
    prompts the user to enter a number and counts up from 0 - N
     */
    public static void main(String[] args){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to count down:");
        number = scan.nextInt();

        for(int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
// end of class CountingUp