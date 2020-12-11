package HomeWork;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class Range begins

public class Range {

    /*
   Main method
   prompts the user to enter starting, ending values of the range and also the increment value
   calls MakeRange method to fill the array accordingly
    */
    public static void main(String[] args) {
        int start, end, inc, size;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the starting point of the range:");
        start = scan.nextInt();

        System.out.println("Enter the end point of the range:");
        end = scan.nextInt();

        if (end < start) {
            System.out.println("invalid range");
            return;
        }

        System.out.println("Enter the increment:");
        inc = scan.nextInt();
        //size = ((end - start) % 2 != 0) ? ((end - start) / inc) + 1 : ((end - start) / inc);
        //System.out.println(size);

        int[] Result = makeRange(start, end, inc );
        int[] Result_k = makeRange(start, end);
        int[] Result_m_k = makeRange(end);

        System.out.println("Resulting array with start,end and increment given:");
        for (int j : Result) {
            System.out.print(j + " ");
        }

        System.out.println("\nResulting array with start and end given:");
        for (int j : Result_k) {
            System.out.print(j + " ");
        }

        System.out.println("\nResulting array if only end given:");
        for (int j : Result_m_k) {
            System.out.print(j + " ");
        }

    }

    /*
    method MakeRange
    determines the size of the array based on the range and increment values given
    fills the array with values
    */
    private static int[] makeRange(int start, int end, int inc) {
        int size = ((end - start) / inc) + 1;
        int[] result = new int[size];
        int index = 0;
        for (int i = start; i <= end; i += inc) {
            result[index] = i;
            index++;
        }
        return result;
    }

    /*
   method MakeRange
   determines the size of the array based on the range given ( only start and end , assuming inc is 1 )
   fills the array with values
   */
    private static int[] makeRange(int start, int end){
//        int inc = 1;
//        int size = ((end - start) / inc) + 1;
//        int[] result = new int[size];
//        int index = 0;
//        for (int i = start; i <= end; i += inc) {
//            result[index] = i;
//            index++;
//        }
//        return result;
        int[] result = makeRange(start,end,1);
        return result;

    }

    /*
    method MakeRange
    determines the size of the array based on the range given ( end , assuming inc is 1 and start is 0)
    fills the array with values
    */
    private static int[] makeRange(int end){
//        int inc = 1;
//        int start = 0;
//        int size = ((end - start) / inc) + 1;
//        int[] result = new int[size];
//        int index = 0;
//        for (int i = start; i <= end; i += inc) {
//            result[index] = i;
//            index++;
//        }
//        return result;

        int[] result = makeRange(0,end,1);
        return result;

    }

}
// end of class range

