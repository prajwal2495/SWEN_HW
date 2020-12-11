package Activities;

/*
**
@author Prajwal Krishna
**
 */

//class CountUpRecursion begins
public class CountUpRecursion
{

    /*
    main method calls method countUp
     */
    public static void main(String[] args)
    {
        countUp(10);
    }


    /*
    method countUp
    counts and prints values from 0 - N
     */
    private static void countUp(int n)
    {
        if (n == 0)
        {
            System.out.println(n);
        }
        else
        {
            int y = n - 1;
            countUp(y);
            System.out.println(n);
        }
    }
}
// end of class CountUpRecursion