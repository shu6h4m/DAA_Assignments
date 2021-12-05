/*

Program to impliment Bucket Sort.

*/

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public void sort(int[] array, int numOfbuckets)
    //This function is designed to sort the array using bucket sort.
    {

        List<List<Integer>> buckets = createbuckets(numOfbuckets, array);
        int i = 0;
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
            for(int item : bucket){
                array[i++] = item;
            }
        }
    }

    private List<List<Integer>> createbuckets(int num_buckets,int[] array)
    //This function is designed to create buckets and store the elements of array in it.
    {
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i=0; i<num_buckets; i++){
            buckets.add(new ArrayList<>());
        }

        for(int item : array){
            buckets.get(item/num_buckets).add(item);
        }

        return buckets;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BucketSort s = new BucketSort();

        System.out.println("--------------------------------------");
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Numbers : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("--------------------------------------");
        System.out.println("Unsorted Array : "+ Arrays.toString(arr));
        s.sort(arr,10);
        System.out.println("After Sorting : "+ Arrays.toString(arr));
    }
}
