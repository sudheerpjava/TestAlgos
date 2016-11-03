package com.amatest;

/**
 * Created by sudheerp on 17/10/16.
 */
public class Dvdr {
    public static void main(String[] args) {

        int[] arr = {6, 4, 2, 1};
      for (int i:dvdArr(arr))
         System.out.print(i+" ");
    }


    public static int[] dvdArr(int arr[]) {
        int min = 0;
        int max = arr.length;
        if (max <= 1)
            return arr;
        int mid = (max - min) / 2;
        int[] s1 = subArr(arr, min, mid);
      /*  for (int i : s1)
            System.out.print(i + "  ");*/
        //System.out.println();
        int s2[] = subArr(arr, mid, max);
        /*for (int i : s2)
            System.out.print(i + "  ");*/
        //System.out.println();
         dvdArr(s1);
         dvdArr(s2);
        merge(arr,s1,s2);
        return arr;
    }

    private static void merge(int[] arr, int[] s1, int[] s2) {
        int n=0;
          int i=0;
        int j=0;
        while (i<s1.length && j<s2.length){
            if (s1[i]<s2[j]){
                arr[n]=s1[i];
                i++;
            }else{
                arr[n]=s2[j];
                j++;
            }
            n++;
        }

    }

    public static int[] subArr(int[] arr, int min, int max) {
        int[] temp = new int[max - min];
        for (int i = 0; i < (max - min); i++) {
            temp[i] = arr[min + i];
        }
        return temp;
    }
}
