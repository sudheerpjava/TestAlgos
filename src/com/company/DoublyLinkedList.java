package com.company;

/**
 * Created by sudheerp on 27/08/16.
 */
public class DoublyLinkedList {


    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtStart(12);
        linkedList.insertAtStart(13);
        linkedList.insertAtEnd(14);
        linkedList.insertAtPosition(10, 2);
        //linkedList.deleteAtPosition(3);
        linkedList.display();

    }

}

//create node for dlinklist
class Node {

    protected int data;
    protected Node next, prev;

    public Node() {
        next = null;
        prev = null;
        data = 0;
    }

    public Node(int data, Node next, Node prev) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    //set link to nextNode
    public void setLinkNext(Node n) {
        next = n;
    }

    public void setLinkPrev(Node p) {
        prev = p;
    }

    public Node getLinkNext() {
        return next;
    }

    public Node getLinkPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

//Create class lInkedlist
class LinkedList {

    protected Node start, end;
    public int size;

    //constructor
    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    //method to check list is empty
    public boolean isEmpty() {
        return start == null;
    }

    //function to get size
    public int getSize() {
        return size;
    }


    //funtion to insert At start

    public void insertAtStart(int data) {
        Node newNode = new Node(data, null, null);
        if (start == null) {
            start = newNode;
            end = start;
        } else {
            start.setLinkPrev(newNode);
            newNode.setLinkNext(start);
            start = newNode;
        }
        size++;
    }

    //function to insert at end

    public void insertAtEnd(int data) {
        Node newNode = new Node(data, null, null);
        if (start == null) {
            start = newNode;
            end = start;
        } else {
            end.setLinkNext(newNode);
            newNode.setLinkPrev(end);
            end = newNode;
        }
        size++;
    }

    //insert  element at position

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data, null, null);
        if (pos == 1) {
            insertAtStart(data);
            return;
        }
        Node pointer = start;
        for (int i = 2; i < size; i++) {
            if (pos == i) {
                Node npointer = pointer.getLinkNext();
                pointer.setLinkNext(newNode);
                newNode.setLinkPrev(pointer);
                newNode.setLinkNext(npointer);
                npointer.setLinkPrev(newNode);
            }
            pointer = pointer.getLinkNext();
        }
        size++;
    }

    //delete node at position

    public void deleteAtPosition(int pos) {
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--;
            return;
        }
        if (pos == size) {
            end = end.getLinkPrev();
            end.setLinkPrev(null);
            size--;
        }
        Node ptr = start.getLinkNext();
        for (int i = 2; i < size; i++) {
            if (i == pos) {
                Node n = ptr.getLinkNext();
                Node p = ptr.getLinkPrev();
                n.setLinkPrev(p);
                p.setLinkNext(n);
                size--;
            }
            ptr = ptr.getLinkNext();
        }
    }
//display the elements in linked list

    public void display() {
        System.out.println("Doubly linked list ==");
        if (size == 0) {
            System.out.println("empty");

            return;
        }
        if (start.getLinkNext() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.println(ptr.getData());
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null) {
            System.out.println(ptr.getData());
            ptr = ptr.getLinkNext();
        }
        System.out.println(ptr.getData());
    }

}
