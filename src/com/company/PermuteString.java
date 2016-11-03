package com.company;

/**
 * Created by sudheerp on 20/09/16.
 */
public class PermuteString {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        permute(arr,0);
    }

    public static void permute(int[] arr,int k){

        if(k==arr.length){
            for (int i:arr){
                System.out.println(i);
            }
        }

    }
}
