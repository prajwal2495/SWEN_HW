package HomeWork;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

public class printTheDate {

    /*
    main method of class printTheDate
    method prompts the user to enter a date in a given format and calls method splitTheInputDate
     */

    public static void main(String[] args) {

        String date = "";
        System.out.println("Enter a valid date in the format YYYY/MM/DD");

        Scanner scan = new Scanner(System.in);
        date = scan.nextLine();

        String result = splitTheInputDate(date);
        System.out.println(result);

    }

    public static String splitTheInputDate(String date) {

        /*
        method splitTheInputDate
        handles the splitting of date into month, day and year to process each of them seperately
        calls  getTheNameOfTheMonth method to get the name of the month
        calls processSuffixForDays method to concatenate a perfect suffix for a given date
         */

        String month = "", day = "";
        String[] dateSplit = date.split("/");

        int years = Integer.parseInt(dateSplit[0]);
        int months = Integer.parseInt(dateSplit[1]);
        int days = Integer.parseInt(dateSplit[2]);

        month = getTheNameOfTheMonth(months);
        day = processSuffixForDays(days);
        return month + " " + days + day +" " + years;
    }


    public static String getTheNameOfTheMonth(int m) {

        /*
        method getTheNameOfTheMonth
        checks whether input is between 1 and 12
        returns the appropriate name of the month that corresponds to the number
         */

        if (m <= 0 || m > 12) {
            System.out.println("Invalid month");
            return "";
        }
        switch (m) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }

    }

    public static String processSuffixForDays(int day) {

        /*
        method processSuffixForDays
        checks if the given date is between 1 and 31
        provides the perfect suffix for the given number
         */


        String suffix = "";
        if (day < 0 || day > 31) {
            System.out.println("day of the month can not be negative or more than 31");
        }

        if (day > 0 && day <= 31) {
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
        }
        return suffix;
    }
}
// end of class printTheDate