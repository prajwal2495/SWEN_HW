package HomeWork;


import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

public class whatIsYourAge {

    /*
    main method of class whatIsYourAge
    method prompts user to input their age and calls funPhraseForYourAge method
     */
    public static void main(String[] args){
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        age = scan.nextInt();

        if(age <= 0){
            System.out.println("enter a correct age:");
            age = scan.nextInt();
        }

        funPhraseForYourAge(age);
    }

    public static void funPhraseForYourAge(int age){

        /*
        method funPhraseForYourAge takes an integer parameter which is the age of the user
        based on the age functions prints out a fun phrase
         */

        if(age <= 0) {
            System.out.println("you cant program if you are not yet born !");
            }else if(age < 10){
                System.out.println("Is this your first program?");
            }else if(age < 13){
                System.out.println("A tween!");
            }else if(age < 20){
                System.out.println("A teen!");
            }else if(age < 30){
                System.out.println("A twenty something!");
            }else{
                System.out.println("With age comes experience.");
            }
        }
    }
    // end of class whatIsYourAge
