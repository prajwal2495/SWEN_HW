package Activities;

/*
**
@author Prajwal Krishna
**
 */

// class CountDownLoop begins
public class CountDownLoop {
    /* method countDown
    As the name suggests it counts down from a given number 'n'
     */
    public static void countDown(int n){
        while(n >= 0){
            System.out.println(n);
            n--;
        }
    }

    // main method calls function countDown
    public static void main(String[] args) {
        int n = 10;
        countDown(n);
    }
}
// end of class CountDownLoop