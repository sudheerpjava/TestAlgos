package com.company;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by sudheerp on 28/09/16.
 */

public class Trie {


    private TrieNode root;

    public  Trie(){
        root=new TrieNode(' ');
    }

    //insert an element into trie

    public void insert(String word){
        if(search(word))
            return;
        TrieNode current=root;
        for (char c:word.toCharArray()){
            TrieNode childNode=current.subNode(c);
            if (childNode!=null)
                current=childNode;
            else{
                current.childList.add(new TrieNode(c));
                current=current.subNode(c);
            }
            current.count++;

        }
        current.isEnd=true;
    }

    //Check whether the string is exist in trie first of all
    //i mean search a word in trie

    public boolean search(String word){
        TrieNode current=root;
        for (char ch:word.toCharArray()){
            if (current.subNode(ch)==null)
                return false;
            else
                current=current.subNode(ch);
        }
        if (current.isEnd==true)
            return true;
        return false;
    }
    //remove an element in trie
    public void remove(String word){
        if (!search(word)) {
            System.out.println("The word does not exists !");
            return;
        }
        //remove the root when count==1
        TrieNode current=root;
        for (char ch:word.toCharArray()){
            TrieNode child=current.subNode(ch);
            if (current.count==1){
                current.childList.remove(child);
                return;
            }else {
                child.count--;
                current=child;
            }
        }
        current.isEnd=false;

    }
    //Test the trie;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of AATree */
        Trie t = new Trie();
        System.out.println("Trie Test\n");
        char ch;
        /*  Perform tree operations  */
        do
        {
            System.out.println("\nTrie Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter string element to insert");
                    t.insert( scan.next() );
                    break;
              case 2 :
                    System.out.println("Enter string element to delete");
                    try
                    {
                        t.remove( scan.next() );
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage()+" not found ");
                    }
                    break;
                case 3 :
                    System.out.println("Enter string element to search");
                    System.out.println("Search result : "+ t.search( scan.next() ));
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}

//create a node for trie using linked list
//So required an charcter and count for atleat one node (Boundry condition)
//is that end or not
//Get the node using char(i mean subnode of a character inn linked list)
class TrieNode{

    char content;
    boolean isEnd;
    int count;

    java.util.LinkedList<TrieNode> childList;

    public  TrieNode(char c){
        content=c;
        isEnd=false;
        childList=new LinkedList<TrieNode>();
        count=0;
    }

    public  TrieNode subNode(char c){
        if (childList!=null)
            for (TrieNode childNode:childList)
                if (childNode.content==c)
                    return childNode;
        return null;
    }
}
