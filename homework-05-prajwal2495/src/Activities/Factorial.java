package Activities;

/*
**
@author Prajwal Krishna
**
 */

// class Factorial begins
public class Factorial {

    /*
    method fact
    return factorial of N using recursion
     */
    public static int fact(int n){
        if(n == 0)
            return 1;

        return n * fact(n - 1);
    }

    /*
    main method
    calls method fact and print eh factorial of N
     */
    public static void main(String[] args) {
        int n = 3;
        System.out.println("factorial of "+ (n) + " is "+ fact(n));
    }
}
// end of class Factorial