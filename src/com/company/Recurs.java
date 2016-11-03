package com.company;

/**
 * Created by sudheerp on 17/10/16.
 */
public class Recurs {
    public static void main(String[] args) {

        Recurs n=new Recurs();
        int[] arr={1,8,4,3,6,7,2,5};
        //System.out.println(recursion(5));
       for (int i:n.mergeSort(arr))
            System.out.print(i+"   ");
        System.out.println();
       System.out.println(n.sumNat(6));
    }

    public static int recursion(int n) {
        System.out.println(n + " ");
        if (n == 0)
            return 1;
        n = n * recursion(n - 1);
        return n;
    }
//sum of 2 natural numbers

    public  int sumNat(int n){
        if(n!=0)
            return  n+sumNat(n-1);
        else
            return n;
    }

    public int[] mergeSort(int arr[]) {

        int max = arr.length;
        int min = 0;
        int mid = (max - min) / 2;
        if(max<=1)
            return arr;
        int[] s1 = subArray(arr, min, mid);

        int[] s2 = subArray(arr, mid, max);

        mergeSort(s1);
       /* for (int i:s1)
            System.out.print(i+" ");
        System.out.println("");*/
        mergeSort(s2);
       /* for (int i:s2)
            System.out.print(i+" ");
        System.out.println("");*/
        merge(arr, s1, s2);
        return arr;
    }

    public int[] merge(int[] arr, int s1[], int s2[]) {
        if (s1.length <= 0 && s2.length <= 0) {
            return arr;
        }
        int s1Length = 0;
        int s2Length = 0;
        int totalLength = 0;
        while (s1Length < s1.length && s2Length < s2.length) {
            if (s1[s1Length] > s2[s2Length]) {
                arr[totalLength] = s1[s1Length];
                s1Length++;
            } else {
                arr[totalLength] = s2[s2Length];
                s2Length++;
            }
            totalLength++;
        }
        while (s1Length<s1.length){
            arr[totalLength]=s1[s1Length];
            s1Length++;
            totalLength++;
        }
        while (s2Length<s2.length){
            arr[totalLength]=s2[s2Length];
            s2Length++;
            totalLength++;
        }
        return arr;
    }

    //copy of range
    public int[] subArray(int arr[], int min, int max) {
        int[] temp = new int[max - min];
        for (int i = 0; i < (max - min); i++) {
            temp[i] = arr[min + i];
        }
        return temp;
    }
}
