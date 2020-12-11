package Activities;

/*
**
@author Prajwal Krishna
**
 */

// class CountDownRecursion begins
public class CountDownRecursion {

    /*
    method countDown
    counts from n to 0
     */
    public static void countDown(int n){
        if(n >= 0){
            System.out.println(n);
            countDown(n-1);
        }
    }
    /*
    main method
    calls method countDown
     */
    public static void main(String[] args) {
        int n = 10;
        countDown(n);
    }
}
// end of CountDownRecursion