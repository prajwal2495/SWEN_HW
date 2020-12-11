package HomeWork;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr, int low, int high){
        if(arr == null || arr.length ==0  ){
            return;
        }
        if(low > high){
            return;
        }

        int pivot = arr[low];
        int i = low, j = high;
        while(i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        if(low < j){
            sort(arr, low, j);
        }
        if(high > i){
            sort(arr, i, high);
        }
    }

    public static void main(String[] args){
        int[] arr = {2,5,1,3,4};
        int low = 0;
        int high = arr.length - 1;
        sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }



}
