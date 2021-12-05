/*

Program to impliment Radix Sort.

*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;


public class RadixSort {

    public void radixSort(Integer[] array)
    //This function is designed to sort the array using radix sort.
    {
        int max = Collections.max(Arrays.asList(array));
        for(int i = 1; max/i > 0; i *= 10){
            count_sort(array, 10, i);
        }
    }

    private void count_sort(Integer[] array, int limit, int pos)
    //This function is designed to sort the array using count sort.
    {
        int[] output = new int[array.length];
        //Array to store count of the array.
        int[] count_array = new int[limit];
        
        for(int item:array){
            ++count_array[(item/pos)%10];
        }

        for (int i = 1; i < 10; i++)
            count_array[i] += count_array[i - 1];

        for(int i = array.length - 1; i>=0; i--){
            output[count_array[(array[i]/pos)%10]-1] = array[i];
            count_array[(array[i]/pos)%10]--;
        }

        for(int i = 0; i < array.length; i++){
            array[i] = output[i];
        }
            
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        RadixSort s = new RadixSort();
        System.out.println("-----------------------------------------");
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.print("Enter the Numbers : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("UnSorted Array : "+ Arrays.toString(arr));
        s.radixSort(arr);
        System.out.println("After Sorting  : "+ Arrays.toString(arr));
    }
}
