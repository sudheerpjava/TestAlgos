package com.amatest;

/**
 * Created by sudheerp on 17/10/16.
 */
public class Testfacb {
    public static void main(String[] args) {
     System.out.print(fac(5));

        for (int i=1;i<=8;i++)
         System.out.print(fab(i)+" ");
    }

    public  static int fac(int n){

        //result=result*fn-1
        int result;
        if (n==1)
            return 1;
        result=fac(n-1)*n;
        return result;
    }

    public  static int fab(int n){
        if (n==1)
            return 1;
        if (n==2)
            return 1;
        return fab(n-1)+fab(n-2);
    }
}
