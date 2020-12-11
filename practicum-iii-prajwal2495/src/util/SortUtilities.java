package util;

import java.util.Arrays;
import java.util.Random;

/**
 * A class that provides a few basic utilities that are useful when
 * sorting an array of integers.
 */
public class SortUtilities {
    /**
     * Used to generate arrays of pseudorandom numbers. The seed is fixed
     * so that the "random" numbers are the same each time.
     */
    private static final Random RNG = new Random(1);

    /**
     * Makes an array of the specified size populated with pseudorandom
     * integers between 0 and size (inclusive).
     *
     * @param size The size of the array to return as well as the upper bound
     *             of the pseudorandom values in the array.
     *
     * @return The new array.
     */
    public static int[] makeArray(int size) {
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = RNG.nextInt(size+1);
        }
        return array;
    }

    /**
     * Makes and returns a sorted array.
     *
     * @param size The size of the array to return.
     *
     * @return The sorted array.
     */
    public static int[] makeSortedArray(int size) {
        int[] array = new int[size];
        for(int i=0; i<size; i++) {
            array[i] = i * 2;
        }
        return array;
    }

    /**
     * Returns a copy of the specified array that has been shuffled; the
     * order of the elements in the original array is randomized in the copy.
     *
     * @param array The array to be copied. This array is not changed.
     *
     * @return A shuffled copy of the original array.
     */
    public static int[] shuffle(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i=0; i<copy.length; i++) {
            int randomIndex = RNG.nextInt(copy.length);
            swap(copy, i, randomIndex);
        }
        return copy;
    }

    /**
     * Returns true if the specified array is sorted, and false otherwise.
     * Used to test whether a sorting algorithm has successfully sorted
     * an array.
     *
     * @param array The array to test.
     *
     * @return Returns true if the specified array is sorted, false otherwise.
     */
    public static boolean sorted(int[] array) {
        for(int i=1; i<array.length; i++) {
            if(array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Swaps the values at index1 and index2 in the specified array.
     *
     * @param array The array in which the two values should be swapped.
     * @param index1 The index of the first value.
     * @param index2 The index of the second value.
     */
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}