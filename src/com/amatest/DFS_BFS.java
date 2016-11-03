package com.amatest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by sudheerp on 23/09/16.
 */
public class DFS_BFS {


    private static TreeNode getUnVisitedChiledNode(TreeNode node) {
        if (node.left != null && !node.left.visited) {
            return node.left;
        }
        if (node.right != null && !node.right.visited)
            return node.right;
        return null;
    }

    //write BFS to find the path in graph

    public  static void bfs(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        System.out.println(root.val);
        root.visited=true;

        while (!queue.isEmpty()){
            TreeNode node=queue.remove();
            TreeNode child=null;
            if((child=getUnVisitedChiledNode(node))!=null){
                child.visited=true;
                System.out.println(child.val);
                queue.add(child);
            }
        }
       // cleearNodes();
    }

    private static void cleearNodes(TreeNode node) {
        node.visited=false;

    }

    //write DFS to find the path in tree/graph
    public static void dfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        root.visited = true;
        System.out.println(root.val);
        while (!stack.isEmpty()){
            TreeNode node = stack.peek();
            TreeNode child=getUnVisitedChiledNode(node);
            if (child!=null){
                child.visited=true;
                System.out.println(child.val);
                stack.push(child);
            }else {
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        //TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        root.left=b;
        root.right=c;
        b.left=e;
        b.right=f;
       // c.left=f;
        //call the dfs to print the result
        dfs(root);
    }
}

class TreeNode {
    protected int val;
    protected TreeNode left, right;

    protected boolean visited;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
