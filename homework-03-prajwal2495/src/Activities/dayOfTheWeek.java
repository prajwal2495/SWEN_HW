package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

public class dayOfTheWeek {
    public static void main(String[] args){

        /*
        main method of class dayOfTheWeek
        prompts user to input a number between 0-6 to know the day of the week
        and day of the month
        calls findTheWeekname to find the weekname for the corresponding number
        calls addSuffixToDayOfTheMonth to add suffix to the day
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 6 to know the day of the week");
        int number = scan.nextInt();


        System.out.println("Enter the day of the month");
        int dayOfTheMonth = scan.nextInt();

        findTheWeekname(number);
        addSuffixToDayOfTheMonth(dayOfTheMonth);
    }


    public static void addSuffixToDayOfTheMonth(int day){

        /*
        addSuffixToDayOfTheMonth adds the perfect suffix to a given number for the day of the month
         */

        String suffix="";
        if( day < 0 || day > 31 ) {
            System.out.println("day of the month can not be negative or more than 31");
        }

        if(day > 0 && day <= 31) {
            int i = day % 10;
            int j = day % 100;

            if (i == 1 && j != 11)
                suffix = "st";
            else if (i == 2 && j != 12)
                suffix = "nd";
            else if (i == 3 && j != 13)
                suffix = "rd";
            else
                suffix = "th";

            System.out.println("it is the " + day + suffix + " day of the month");
        }
    }



    public static void findTheWeekname(int n){

        /*
        findTheWeekname method
        based on the number given by user corresponding name of the week is returned
         */
        switch (n){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a correct number");
        }

    }
}
// end of class dayOfTheWeek