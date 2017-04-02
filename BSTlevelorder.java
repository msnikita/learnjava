/*
A level-order traversal of tree  is a recursive algorithm that processes the root, followed by the children of the root (from left to right), followed by the grandchildren of the root (from left to right), etc.

Sample Input

6
3
5
4
7
2
1

Sample output:
3 2 5 1 4 7 

*/

import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    static void BSTlevelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.peek();
            System.out.print(current.data + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null){
                queue.add(current.right);
            }
            queue.poll();
        }
        
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
