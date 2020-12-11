package HomeWork;
import Activities.*;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    private static boolean isOperator = false;

    private String[] operations;
    public Calculator(String[] operations){
        this.operations = operations;
        System.out.println(Arrays.toString(this.operations));
    }


    public double operandAndOperators(String operator, double[] operands) {
        double result = 0;

        for(int i = 0; i < operations.length; i++){
            if(operator.equals(operations[i])){
                isOperator = true;
            }
            continue;
        }

        if(isOperator == false){
            System.out.println("Invalid operator: "+operator);
            return -1;
        }else{
            switch(operator){
                case "+":
                    Activities.Sum sum = new Sum();
                    for(int i = 0; i < operands.length; i++){
                        result = sum.operation(operands);
                    }
                    return result;

                case "*":
                    Multiply multiply = new Multiply();
                    for (int i = 0 ; i < operands.length; i++){
                        result = multiply.operation(operands);
                    }
                    return result;

                case "**":
                case "^":
                    Exponent exponent = new Exponent();
                    for(int i = 0; i < operands.length; i++){
                        result = exponent.operation(operands);
                    }
                    return result;

                case "-":
                    Activities.Difference difference = new Difference();
                    for(int i = 0; i < operands.length; i++){
                        result = difference.operation(operands);
                    }
                    return result;

                case "//":
                    IntegerDivision integerDivision = new IntegerDivision();
                    for(int i = 0; i < operands.length; i++){
                        result = integerDivision.operation(operands);
                    }
                    return result;

                case "%":
                    Modulo modulo = new Modulo();
                    for(int i = 0; i < operands.length; i++){
                        result = modulo.operation(operands);
                    }
                    return result;


                default:
                    return -1;
            }
        }
    }



    public static void main(String[] args) {
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};

        System.out.println("Available operators:");
        Calculator obj = new Calculator(operators);

        Scanner scan = new Scanner(System.in);
        String breakPoint = "Y";
        while (breakPoint.equals("Y") || breakPoint.equals("y")) { ;
            System.out.println("Enter a operator:");
            String operator = scan.next();
            System.out.println("Enter two operands:");
            double[] operands = new double[2];
            for (int i = 0; i < operands.length; i++) {
                operands[i] = scan.nextDouble();
            }

            double result = obj.operandAndOperators(operator, operands);
            System.out.println("Result: "+result);


            System.out.println("Do you want to continue executing calculator method: (Y / Quit)");
            breakPoint = scan.next();

        }
        System.out.println("BYE!!");
    }
}
