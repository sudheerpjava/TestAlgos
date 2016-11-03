package com.company;

import java.util.Scanner;

/**
 * Created by sudheerp on 18/09/16.
 */
//create a node for btree
class BTreeNode {

    protected BTreeNode left, right;
    protected int data;

    public BTreeNode() {
        left = null;
        right = null;
        data = 0;
    }

    public BTreeNode(int val) {
        left = null;
        right = null;
        data = val;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public BTreeNode getRight() {
        return right;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }
}


//class BT construct here
class BT {

    protected BTreeNode root;

    public BT() {
        root = null;
    }

    //check tree is empty or not

    public boolean isEmpty() {
        return root == null;
    }

    //insert an element into Btree

    public void insert(int data) {

        root = insert(data, root);
    }

    public BTreeNode insert(int data, BTreeNode root) {

        if (root == null) {
            root = new BTreeNode(data);
        } else {
            if (data >= root.getData())
                root.right = insert(data, root.right);
            else
                root.left = insert(data, root.left);
        }
        return root;
    }

    //preorder

    public  void preorder(){
        preorder(root);
    }
    //Preorder traversal
    public void preorder(BTreeNode root){
        if (root!=null){
            preorder(root.getLeft());
            System.out.println(root.getData());
           // System.out.println("--right--");
            preorder(root.getRight());
        }
    }
}

//Test the Btree here
public class BTree {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eneter the element into btree  ..insert element upto say Y/y----\n");
        BT bt=new BT();
        String ch;
        do {
            System.out.println("Enter integer element to insert");
            bt.insert( scanner.nextInt() );
            System.out.println("Do you eant to continue--");
            ch=scanner.next();
        }while ("y".equalsIgnoreCase(ch));
        bt.preorder();
        System.out.println();
    }
}
