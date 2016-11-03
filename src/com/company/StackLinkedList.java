package com.company;

import java.util.NoSuchElementException;

/**
 * Created by sudheerp on 17/09/16.
 */
public class StackLinkedList {
    public static void main(String[] args) {
        SLiknList sLiknList=new SLiknList();
        sLiknList.push(12);
        sLiknList.push(13);
        sLiknList.pop();
        sLiknList.pop();
        sLiknList.display();
    }
}

//Create a node

class SNode{

    protected  int data;
    protected  SNode link;

    public SNode(){
        link=null;
        data=0;
    }

    public SNode(int data,SNode l){
        this.data=data;
        link=l;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public SNode getLink() {
        return link;
    }

    public void setLink(SNode link) {
        this.link = link;
    }

}

class SLiknList{
    protected SNode top;
    protected  int size;
    SLiknList(){
        top=null;
        size=0;
    }
    //get size
    public int getSize(){
        return size;
    }
    //check is empty or not
    public boolean isEmpty(){
        return top==null;
    }


    //add node into stact
    public void push(int data){
        SNode newNode=new SNode(data,null);
        if (top==null){
            top=newNode;
        }
        else {
            newNode.setLink(top);
            top=newNode;
        }
        size++;
    }
    //delete an element from stack
    public int pop(){

        if(isEmpty()){
            throw new NoSuchElementException("UnderFlow stack exception\n");
        }
        SNode nptr=top;
        top=nptr.getLink();
       size--;
        return nptr.getData();
    }

    //get the top element
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("UnderFlow stack exception\n");
        }
        return top.getData();
    }

    //display all the elements
    public void display(){
        System.out.println("Elements in stack :----");
        if (size==0){
            System.out.print("empty\n");
        }
        SNode ptr=top;

        while (ptr!=null){
            System.out.println(ptr.getData()+"\n");
            ptr=ptr.getLink();
        }
    }
}