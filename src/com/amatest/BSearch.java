package com.amatest;

/**
 * Created by sudheerp on 19/10/16.
 */
public class BSearch {
    public static void main(String[] args) {

        BSearch b=new BSearch();
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13};
        if(b.bSearch(arr,4)){
            System.out.println("element found");
        }else {
            System.out.println("element not found");
        }
    }

    public boolean bSearch(int[] arr,int x){
        int max=arr.length;
        int min=0;
       return ternarySearch(arr,min,max-1,x);
    }

    public boolean search(int[] arr,int min,int max,int x) {

        if (max >= min) {
            int mid = min +(max-min) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] > x) {
               return search(arr, min, mid-1, x);
            } else {
                return search(arr, mid+1, max, x);
            }

        }
        return false;
    }

    public  boolean ternarySearch(int[] arr,int min,int max,int x){
        if(max>=min){
            int mid1=min+(max-min)/3;
            int mid2=mid1+(max-min)/3;
            if(arr[mid1]==x){
                return true;
            }
            if (arr[mid2]==x)
                return true;
            if (arr[mid1]>x)
                return ternarySearch(arr,min,mid1-min,x);
            if(arr[mid2]<x)
                return ternarySearch(arr,mid2+min,max,x);
            return ternarySearch(arr,mid1+min,mid2-min,x);
        }
        return false;
    }
}
