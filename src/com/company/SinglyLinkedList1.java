package com.company;

/**
 * Created by sudheerp on 17/09/16.
 */
public class SinglyLinkedList1 {
}

class SLNode1{
    protected  int data;
    protected SLNode1 link;

    public SLNode1(){
        data=0;
        link=null;
    }

    public SLNode1(int data,SLNode1 link){
        this.data=data;
        this.link=link;
    }

    public void setLink(SLNode1 link) {
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SLNode1 getLink() {
        return link;
    }
}

class SLLinKedList1{

    protected SLNode1 start;
    protected  int size;

    SLLinKedList1(){
        start=null;
        size=0;
    }

    //get the size of list
    public int getSize(){
        return size;
    }
    //check the is empty for list

    public boolean isEmpty(){
        return start==null;
    }

    //insert an element ine asc order
    public  void insert(int data){
        SLNode1 newNode=new SLNode1(data,null);
        if(start==null){
            start=newNode;
            return;
        }
        if(data<=start.getData()){
            newNode.setLink(start);
            start=newNode;
        }else {
            SLNode1  tmp=start;
            SLNode1 ptr=start.getLink();
            boolean ins=false;
            while (ptr!=null) {
                if (data >= tmp.getData() && data <= ptr.getData()) {
                    newNode.setLink(ptr);
                    tmp.setLink(newNode);
                    ins=true;
                    break;
                }else {
                    tmp=ptr;
                    ptr=ptr.getLink();
                }
            }
            if (!ins){
                tmp.setLink(newNode);
            }
        }

size++;
    }


}
