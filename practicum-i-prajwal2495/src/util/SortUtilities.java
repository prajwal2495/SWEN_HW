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

    /**
     * Uses the even/odd approach to divide the values in the specified array
     * into two arrays of approximately equal length. That is to say that the
     * values at even numbered indexes will be returned in one array, and the
     * values at odd numbered indexes in another.
     *
     * @param array The array to be divided.
     *
     * @return A two-dimensional array containing two arrays; the first is the
     * array containing the values at even numbered indexes, and the second is
     * the array containing the values at odd numbered indexes.
     */
    public static int[][] divide(int[] array) {
        int[] odds = new int[array.length/2];
        int[] evens = new int[array.length - odds.length];

        int evensIndex = 0;
        int oddsIndex = 0;

        for(int i=0; i<array.length; i++) {
            if(i % 2 == 0) {
                evens[evensIndex] = array[i];
                evensIndex++;
            } else {
                odds[oddsIndex] = array[i];
                oddsIndex++;
            }
        }

        return new int[][] { evens, odds };
    }

    /**
     * Merges the values in the two arrays together in sorted order. A
     * pre-condition is that both arrays are already sorted.
     *
     * @param a The first sorted array of integers.
     * @param b The second sorted array of integers.
     *
     * @return The array containing all of the values from arrays a and b
     * merged together in sorted order.
     */
    public static int[] merge(int[] a, int[] b) {
        if(a.length == 0) {
            return b;
        } else if(b.length == 0) {
            return a;
        } else {
            int[] merged = new int[a.length + b.length];

            int i = 0;
            int j = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    merged[i + j] = a[i];
                    i++;
                } else {
                    merged[i + j] = b[j];
                    j++;
                }
            }


            if(i < a.length) {
                // some values remaining in a...copy them
                System.arraycopy(a, i, merged, i + j, a.length - i);
            } else if(j < b.length) {
                // some values remaining in b...copy them
                System.arraycopy(b, j, merged, i + j, b.length - j);
            }

            return merged;
        }
    }

    /**
     * Returns a new array that contains all of the values from the arrays
     * parameter cooncatenated end-to-end together in order.
     *
     * @param arrays The arrays to be concatenated together.
     *
     * @return A new array that contains all of the values from the arrays
     * parameter cooncatenated end-to-end together in order.
     */
    public static int[] cat(int[] ... arrays) {
        int total = 0;
        for(int[] array : arrays) {
            total += array.length;
        }
        int[] concatenation = new int[total];

        int start = 0;
        for(int[] array : arrays) {
            System.arraycopy(array, 0, concatenation, start, array.length);
            start += array.length;
        }

        return concatenation;
    }
}
