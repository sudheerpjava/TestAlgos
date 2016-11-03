package com.amatest;

import java.util.Scanner;

/**
 * Created by sudheerp on 27/09/16.
 */
public class GraphAdj {
    private final int vertices;

    private int [][] adjcency_matrix;

    public GraphAdj(int v){
        vertices=v;
        adjcency_matrix=new int[vertices+1][vertices+1];
    }
    //make an edge

    public  void makeEdge(int to,int from,int edge){
        try {
            adjcency_matrix[to][from]=edge;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The vertices are does not exists");
        }
    }

    //get edge

    public  int getEdge(int to,int from){
        try {
            return adjcency_matrix[to][from];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The vertices are does not exist");
        }
        return  -1;
    }

    public static void main(String[] args) {
        int v,e,count=1,to=0,from=0;
        Scanner sc=new Scanner(System.in);
        GraphAdj graphAdj;
        try {
            System.out.println("Enter the number of vertices");
            v=sc.nextInt();
            System.out.println("Enter the number of  childrens");
            e=sc.nextInt();
            graphAdj=new GraphAdj(v);
            System.out.println("Enter the edges:<to><from>");
            while (count<=e){
                to=sc.nextInt();
                from=sc.nextInt();
                graphAdj.makeEdge(to,from,1);
                count++;
            }
            System.out.println("The adjucency matrix for given grap is:");
            System.out.print(" ");
            for (int i=1;i<=v;i++)
                System.out.print(i+ " ");

            System.out.println();
            for (int i=1;i<=v;i++){
                System.out.print(i+ " ");
                for (int j=1;j<=v;j++){
                    System.out.print(graphAdj.getEdge(i,j)+" ");
                }
                System.out.println();
            }
        }catch (Exception ex){
            System.out.println("something gone wrong");
        }
    }
}
