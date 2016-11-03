package com.amatest;

/**
 * Created by sudheerp on 06/10/16.
 */

class SkipNode{

    int element;
    SkipNode right;
    SkipNode down;

    SkipNode(int x){
        this(x,null,null);
    }
    SkipNode(int x,SkipNode rt,SkipNode dn){
        element=x;
        right=rt;
        down=dn;
    }

}

class  SkipList{

    private  SkipNode header;
    private int infinity;
    private  SkipNode bottom=null;
    private  SkipNode tail=null;


    public SkipList(int inf){
        infinity=inf;
        bottom=new SkipNode(0);
        bottom.right=bottom.down=bottom;
        tail=new SkipNode(infinity);
        tail.right=tail;
        header=new SkipNode(infinity,tail,bottom);
    }


    //insert an element into SkipList
    public  void insert(int x){
        SkipNode current=header;
        bottom.element=x;
        while (current!=bottom){
            while (current.element<x)
                current=current.right;

        }
    }
}
public class SkipListTest {
}
