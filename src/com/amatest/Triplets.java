package com.amatest;

import java.io.*;

/**
 * Created by sudheerp on 20/10/16.
 */
public class Triplets {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array :  ");
        int size = 0;

        size = Integer.parseInt(reader.readLine());

        if (size < 3) {
            System.out.println("Please enter array size >2.You entered --" + size);
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements for array :");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Triplets triplets = new Triplets();
        triplets.printTriplets(arr, size);
    }

    public void printTriplets(int[] arr, int n) {
        int i = 0, j = 1, k = 2;
        int result = 0;
        int count = 0;
        count = calculate(arr, result, count, n);
        System.out.println("Result   :  " + count);


    }

    public int calculate(int[] arr, int result, int count, int n){
        int i=0;
        int j=i+1;
        int k=j+1;
        int ktemp=k;
        int jtemp=j;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                for (k=j+1;k<n;k++){
                    result=result+(int)Math.floor((arr[i]+arr[j]+arr[k])/(arr[i]*arr[j]*arr[k]));
                    System.out.println(i+" "+j+" "+k+"--->"+count++ +"result :-->"+result);
                }
                k=ktemp;
            }
            j=jtemp;
        }
        return result;
    }
}
