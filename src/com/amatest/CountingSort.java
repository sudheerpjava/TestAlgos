package com.amatest;

/**
 * Created by sudheerp on 28/09/16.
 */
public class CountingSort {

    private static  final int MAX_RANGE=1000000;

    //counting sort function
    public  static  void sort(int[] arr){
        int N=arr.length;
        if (N==0)
            return;
        //find the min and max values

        int max=arr[0],min=arr[0];
        for (int i=1;i<N;i++){

            if (arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
                min=arr[i];
        }
        int range=max-min+1;
        //check whether the range is small enough for count array
        if (range>MAX_RANGE){
            System.out.println("\n Error,The range is too large");
            return;
        }
        int[] count=new int[range];
        //make count array form each element
        for (int i=0;i<N;i++)
            count[arr[i]-min]++;
        //modify the count
        for (int i=0;i<N;i++)
            count[i]+=count[i-1];
        //modify the original
        int j=0;
        for (int i=0;i<N;i++)
            while (j<count[i++])
                arr[j++]=i+min;
    }

}
