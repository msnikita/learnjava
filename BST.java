/*
 * Program to calculate max height of the Binary Search Tree
 * Sample Input

  7
  3
  5
  2
  1
  4
  6
  7

Sample Output

3

*/


import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
    /*
     * Code to calculate the max height
     */
    public static int getHeight(Node node){
        if (node == null)
            /*
             * Most important is to return -1  
             */
            return -1;
        else
        {
            /* compute the height of each subtree */
            int lheight = getHeight(node.left);
            int rheight = getHeight(node.right);
  
            /* use the larger one */
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }
    
    /*
     * Insert Node BST
     */
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
            while(T-- > 0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}


    
