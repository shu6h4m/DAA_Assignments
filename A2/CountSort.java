/*

Program to impliment Count Sort.

*/

import java.util.Scanner;
import java.util.Arrays;

public class CountSort {
    public void countSort(int[] array, int limit)
    //This function is designed to sort the array using count sort.
    {
        int[] count_array = new int[limit];
        for(int item:array){
            ++count_array[item];
        }

        int k = 0;
        for(int i = 0; i<count_array.length; i++){
            for(int j = 0; j<count_array[i]; j++){
                array[k++] = i;
            }
        }
    }


    public static void main(String[] args){
        CountSort sort = new CountSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.print("Enter the length Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements : ");
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Given Array  : "+ Arrays.toString(array));
        sort.countSort(array,100);
        System.out.println("Sorted Array : "+ Arrays.toString(array));
    }
}
