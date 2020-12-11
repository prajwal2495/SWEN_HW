package HomeWork;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */


public class musicOrMovies {

    /*
    Main method of class musicOrMovies
    asks for choice to discuss about movies or music from user
    based on choice a conversation with user is initiated
     */
    public static void main(String[] args){
        int choice,episodeChoice;
        String musicChoice;
        System.out.println("Press 1 to discuss about music");
        System.out.println("Press 2 to discuss about movies");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        if(choice < 1 || choice > 2){
            System.out.println("pick a proper choice");
            choice = scan.nextInt();
        }

        switch (choice){
            case 1:
                System.out.println("Do you like Linkin park ? type yes/no");
                musicChoice = scan.next();

                if(musicChoice.equals("yes")) {
                    System.out.println("Good Taste!");
                } else {
                    System.out.println("There is no accounting for taste");
                }
                break;

            case 2:
                System.out.println("Which Star Wars Episode was the best? 1/2/3/4/5/6/7");
                episodeChoice = scan.nextInt();

                if(episodeChoice < 1 || episodeChoice > 7)
                    System.out.println("Episode doesn't exist");

                if(episodeChoice == 1 || episodeChoice == 2 || episodeChoice == 3)
                    System.out.println("Um,no");

                if(episodeChoice == 4 || episodeChoice == 5)
                    System.out.println("I agree !");

                if(episodeChoice == 6 || episodeChoice == 7)
                    System.out.println("I like those too");
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}
// end of class musicOrMovies