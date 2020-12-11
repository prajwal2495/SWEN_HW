package Activities;

/*
**
@author Prajwal Krishna
**
 */

// class MultiplicationTable begins

public class MultiplicationTable {

    /*
    Main Method:
    loads a 2D array of size 10 * 10 with multiplication table
     */
    public static void main(String[] args){
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = (row + 1) * (col + 1);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%2d  ",matrix[row][col]);
            }
            System.out.println();
        }
    }
}
// end of class MultiplicationTable