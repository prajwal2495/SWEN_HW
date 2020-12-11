package practicum1;

import java.util.Scanner;

public class Calculator {

    private static double total = 0.0;

    public static void Addition(double  a , double b){
        total += (a + b);
    }

    public static void Subtraction(double a, double b){
        total -= (a - b);
    }

    public static void Multiplication(double a, double b){
        if(total == 0){
            total = (a * b);
        }else {
            total *= (a * b);
        }
    }

    public static void Division(double a, double b) {
        if (total == 0) {
            total = (a / b);
        } else {
            total /= (a / b);
        }
    }

    public static void Modulo(double a, double b){
        total %= (a % b);
    }

    public static void main(String[] args) {
        String choice;
        double num1, num2;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Calculator !");
        System.out.println("Your choices are:");
        System.out.println("+ for Addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("% for modulo operation");
        System.out.println("quit to exit");

            while(flag) {
                System.out.println("Enter your choice");
                choice = scan.next();
                switch (choice) {
                    case "+":
                        System.out.println("Enter two numbers:");
                        num1 = scan.nextDouble();
                        num2 = scan.nextDouble();
                        Addition(num1, num2);
                        System.out.println("Current total: " + total);
                        break;

                    case "*":
                        System.out.println("Enter two numbers:");
                        num1 = scan.nextDouble();
                        num2 = scan.nextDouble();
                        Multiplication(num1, num2);
                        System.out.println("Current total: " + total);
                        break;

                    case "/":
                        System.out.println("Enter two numbers:");
                        num1 = scan.nextDouble();
                        num2 = scan.nextDouble();
                        Division(num1, num2);
                        System.out.println("Current total: " + total);
                        break;

                    case "%":
                        System.out.println("Enter two numbers:");
                        num1 = scan.nextDouble();
                        num2 = scan.nextDouble();
                        Modulo(num1, num2);
                        System.out.println("Current total: " + total);
                        break;

                    case "-":
                        System.out.println("Enter two numbers:");
                        num1 = scan.nextDouble();
                        num2 = scan.nextDouble();
                        Subtraction(num1, num2);
                        System.out.println("Current total: " + total);
                        break;

                    case "quit":
                        System.out.println("Good bye!");
                        flag = false;
                        break;

                    default:
                        System.out.println("Invalid Choice");
                        flag = false;
                }
            }
    }
}
