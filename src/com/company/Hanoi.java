package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sudheerp on 18/09/16.
 */
public class Hanoi {

    public static Stack<Integer>[] tower=new Stack[4];
    public  static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
         /* Accepting number of disks */
        System.out.println("Enter number of disks");
        int num = scan.nextInt();
        n = num;
        toh(num);

    }

    //push disks into stack
    public static void toh(int n){

        for (int d=n;d>0;d--){
            tower[1].push(d);
        }
        diplay();
        move(n,1,2,3);

    }

    //Create a recursive funtin to move the disk to last
    private static void move(int n, int a, int b, int c) {
        if (n>0){
            move(n-1,a,c,b);
            int d=tower[a].pop();
            tower[c].push(d);
            diplay();
            move(n-1,b,a,c);
        }
    }

    //create display method to print toh

    public  static void diplay(){
        System.out.println("  A  |  B  |  C");
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        for(int i = n - 1; i >= 0; i--)
        {
            String d1 = " ", d2 = " ", d3 = " ";
            try
            {
                d1 = String.valueOf(tower[1].get(i));
            }
            catch (Exception e){
            }
            try
            {
                d2 = String.valueOf(tower[2].get(i));
            }
            catch(Exception e){
            }
            try
            {
                d3 = String.valueOf(tower[3].get(i));
            }
            catch (Exception e){
            }
            System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
        }
        System.out.println("\n");
    }
}


