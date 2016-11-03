package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by sudheerp on 21/09/16.
 */
public class BHeap {

    //The number of children each node has is 2
    private  static final int d=2;
    private int heapSize;
    private int[] heap;

    BHeap(int capacity){
        heapSize=0;
        heap=new int[capacity+1];
        Arrays.fill(heap,-1);
    }

    //function to check if  heap is empty
    public boolean isEmpty(){
        return heapSize==0;
    }

    //check if heap is full

    public boolean isFull(){
        return heapSize==heap.length;
    }

    //make heap empty

    public  void makeEmpty(){
        heapSize=0;
    }

    //find the kth element in heap

    public int kthChild(int i, int k){
        return d*i+k;
    }

    //insert a node into heap

    public void insert(int x){
        if (isFull())
            throw new NoSuchElementException("Overflow exception");
        heap[heapSize++]=x;
    }

    //function to heapifyUp


}
