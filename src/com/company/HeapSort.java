package com.company;

/**
 * Created by sudheerp on 19/09/16.
 */
public class HeapSort {
    private static int N;

    //sort the array

    public static void sort(int[] arr){

    }

    //Function to build heapify
    public  static void heapify(int arr[]){

        N=arr.length-1;
        for (int i=N/2-1;i>0;i--)
            maxHeap(arr,i);
    }

    //function to swap in maxheap
    public static void maxHeap(int[] arr,int i){
        int left=2*i;

    }


}
