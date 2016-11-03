package com.company;

import java.util.Stack;

/**
 * Created by sudheerp on 22/09/16.
 */
public class Para {
    public static void main(String[] args) {
        String par = "[()()]";

        if (isGFG(par)){
            System.out.println("balnaced");
        }else{
            System.out.println(" Not balnaced");
        }


    }

    public static boolean isGFG(String par){
        Stack stack = new Stack();
        for (char c:par.toCharArray()) {
            switch (c){
                case ')':
                    if((Character)stack.pop()!='(') {
                    return false;
                    }
                    break;
                case ']':
                    if((Character)stack.pop()!='[') {
                        return false;
                    }
                    break;
                default:
                    stack.push(c);
            }

        }
        return true;
    }
}
