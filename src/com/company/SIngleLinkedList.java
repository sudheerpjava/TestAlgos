package com.company;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.List;

/**
 * Created by sudheerp on 21/08/16.
 */
public class SIngleLinkedList {
    //private ListNode head;

    //it contains a static inner class as a node
    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    //Insert an element at begining of linkedList
    public ListNode insertAtBegining(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Insert an element at end of linkedList
    public ListNode insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
        return newNode;
    }

    //Insert an element at given position of linkedList
    public ListNode insertAtPosition(ListNode head, int data, int position) {

        int size=length(head);
        if(position >size+1 || position<1){
            System.out.println("Invalid position");
        }

        ListNode newNode = new ListNode(data);
        if(position==1){
            newNode.next=head;
            return newNode;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
            return head;
        }
    }

    //display all the elements in Linked List
    public void display(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;

        }
        System.out.print(current);
    }

//find the length of the linkedList
    public int length(ListNode head){
        int count=0;
        if(head==null){
            return count;
        }
        while(null!=head.next){
            head=head.next;
            count++;
        }
        return count;

    }
    public static void main(String args[]) {
        SIngleLinkedList linkedList = new SIngleLinkedList();
        ListNode head = new ListNode(12);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(2);
        head.next = second;//12-->8
        second.next = third;//12-->8-->10
        third.next = fourth;//12-->8-->10-->2
        linkedList.display(head);
        ListNode newHead = linkedList.insertAtBegining(head, 15);
        linkedList.insertAtEnd(newHead, 13);
        head =linkedList.insertAtPosition(newHead, 20, 2);
        System.out.println("");
        System.out.println("=========================");
        linkedList.display(head);
    }
}
