package HomeWork;

import java.util.Random;
import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

public class guessTheNumber {

    /*
    Main method of class guessTheNumber which generates a random number between 1-10 and user tries to guess the number
    calls the function isGuessTrueOrFalse to calculate the guess.
     */
    public static void main(String[] args){

        Random random = new Random();
        int numberToBeGuessed = 0,numberOfChances = 3;

        while (true){
            numberToBeGuessed = random.nextInt(11);
            if(numberToBeGuessed !=0)
                break;
        }

        Scanner scan = new Scanner(System.in);
        //System.out.println(numberToBeGuessed);

        boolean result = isGuessTrueOrFalse(scan, numberToBeGuessed,numberOfChances);

    }

    public static boolean isGuessTrueOrFalse(Scanner input,int numberGoal,int chances){
        /*
        function isGuessTrueOrFalse takes 3 parameters
        1. an Scanner object ( optional )
        2. number to be guessed of type int
        3. chances given to your to guess correctly. max 3
         */

        int guess = 0;

        if(chances > 0) {
            System.out.println("\nGuess a number:");
             guess = input.nextInt();
        }
        else{
            System.out.println("\nyou have exhausted your chances, the number was " +(numberGoal));
            return false;
        }

        if(guess < numberGoal){
            chances--;
            System.out.println("Too Low");
            System.out.println("Guess again, you have "+ chances + " chance/s left");
            isGuessTrueOrFalse(input,numberGoal,chances);
        }

        if(guess > numberGoal){
            chances--;
            System.out.println("Too High");
            System.out.println("Guess again, you have "+ chances + " chance/s left");
            isGuessTrueOrFalse(input,numberGoal,chances);
        }

        if(guess == numberGoal){
            System.out.println("Correct !");
            return true;
        }


        return false;

    }
}
// end of class guessTheNumber