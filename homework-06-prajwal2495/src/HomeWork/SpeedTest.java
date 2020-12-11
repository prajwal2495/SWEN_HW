package HomeWork;

import java.util.Arrays;

/*
**
@author Prajwal Krishna
**
 */

//class SpeedTest begins
public class SpeedTest {

    // calls InsertionSort method and calculates the speed of execution
    public static void InsertionSortSpeed(int[] array){
        int size = array.length;
        System.out.println("\nInsertion sort on "+ size +" elements");
        long start_time = System.currentTimeMillis();
        int[] I_sorted = sorts.InsertionSort(array);
        long end_time = System.currentTimeMillis();
        System.out.println("\nArray is sorted: "+SortUtilities.isSorted(I_sorted));
        //System.out.println(Arrays.toString(I_sorted));
        System.out.println("Time taken by insertion sort: "+ (end_time - start_time) + " ms");
    }

    // calls MergeSort method and calculates the speed of execution
    public static void MergeSortSpeed(int[] array){
        int size = array.length;
        System.out.println("\nMerge sort on "+ size +" elements");
        long start_time = System.currentTimeMillis();
        int[] M_sorted = sorts.MergeSort(array);
        long end_time = System.currentTimeMillis();
        System.out.println("\nArray is sorted: "+SortUtilities.isSorted(M_sorted));
        //System.out.println(Arrays.toString(M_sorted));
        System.out.println("Time taken by Merge sort: "+ (end_time - start_time)+ " ms");

    }

    // calls BubbleSort method and calculates the speed of execution
    public static void BubbleSortSpeed(int[] array){
        int size = array.length;
        System.out.println("\nBubble sort on "+ size +" elements");
        long start_time = System.currentTimeMillis();
        int[] B_sorted = sorts.BubbleSort(array);
        long end_time = System.currentTimeMillis();
        System.out.println("\nArray is sorted: "+SortUtilities.isSorted(B_sorted));
        //System.out.println(Arrays.toString(B_sorted));
        System.out.println("Time taken by Merge sort: "+ (end_time - start_time)+ " ms");
    }

    // calls QuickSort method and calculates the speed of execution
    public static void QuickSortSpeed(int[] array){
        int size = array.length;
        System.out.println("\nQuick sort on "+ size +" elements");
        long start_time = System.currentTimeMillis();
        int[] Q_sorted = sorts.QuickSort(array);
        long end_time = System.currentTimeMillis();
        System.out.println("\nArray is sorted: "+SortUtilities.isSorted(Q_sorted));
        //System.out.println(Arrays.toString(Q_sorted));
        System.out.println("Time taken by Merge sort: "+ (end_time - start_time)+ " ms");
    }

    public static void main(String[] args) {
        /*
        creates an array of random values of size 10k
        makes copies of it since the random seed is 1
        and calls Insertion sort, Merge sort, Bubble sort, Quick sort
         */
        int[] I_data = SortUtilities.makeArray(10000);
        int[] M_data = Arrays.copyOf(I_data,10000);
        int[] B_data = Arrays.copyOf(I_data,10000);
        int[] Q_data = Arrays.copyOf(I_data,10000);

        System.out.println("------ Insertion sort-------");
        System.out.println("Array is already sorted: "+SortUtilities.isSorted(I_data));
        //System.out.println(Arrays.toString(I_data));
        InsertionSortSpeed(I_data);


        System.out.println("\n------ Merge sort-------");
        System.out.println("Array is already sorted: "+SortUtilities.isSorted(M_data));
        //System.out.println(Arrays.toString(M_data));
        MergeSortSpeed(M_data);


        System.out.println("\n------ Bubble sort-------");
        System.out.println("Array is already sorted: "+SortUtilities.isSorted(B_data));
        //System.out.println(Arrays.toString(B_data));
        BubbleSortSpeed(B_data);


        System.out.println("\n------ Quick sort-------");
        System.out.println("Array is already sorted: "+SortUtilities.isSorted(Q_data));
        //System.out.println(Arrays.toString(Q_data));
        QuickSortSpeed(Q_data);
    }
}
// end of class SpeedTest