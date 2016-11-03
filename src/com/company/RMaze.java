package com.company;

/**
 * Created by sudheerp on 22/09/16.
 */
public class RMaze {

    public  static int N=4;
    //print output
    public  static void print(int[][] sol){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(sol[i][j]);
            }
            System.out.println("");
        }
    }

    //check the next element in true/safe to go /1

    /**
     * @param maze
     * @param x
     * @param y
     * @return
     */
    public static boolean isSafe(int[][] maze,int x,int y){
        return  (x>=0 && y>=0 && x<N && y<N && maze[x][y]==1);
    }

    //solve the maze
    public  static  boolean solveMaze(int[][] maze){
        int sol[][]={{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};


                if (mazeUtil(maze,0,0,sol)==false){
                    System.out.println("Solution does not exists !");
                    return false;
                }
                print(sol);
        return true;
    }

    //mazeutil
    public static boolean mazeUtil(int[][] maze,int x,int y,int[][] sol){
        if (x==N-1 && y==N-1){//boundary condition
            sol[x][y]=1;
            return true;
        }
        if (isSafe(maze,x,y)){//base condition to match whether 1 is there or not( i mean way)
                sol[x][y]=1;
            //move forward in x direction
            if (mazeUtil(maze,x+1,y,sol)){
                return  true;
            }
            //move forward in y direction
            if (mazeUtil(maze,x,y+1,sol)){
                return  true;
            }
            //if none of the above steps work back track
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze={
                {1,0,0,0},
                {1,1,0,0},
                {1,1,1,1},
                {1,1,1,1}};
        solveMaze(maze);
    }
}
