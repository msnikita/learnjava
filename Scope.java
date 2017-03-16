/*
--------------------Theory-------------------

Scope 
This term refers to the region of the program to which an identifier applies. While it is not good practice, you can declare multiple variables within a program that use the same identifier as long as the identifiers have differing scopes; some exceptions to this are:
A constructor or method parameter will often have the same name as a class field it's intended to initialize or modify.
It is customary to use i as the condition variable in a for-loop (and, in cases of nested for-loops, to use j as the condition variable for the inner loop). 

Note: When dealing with a class variable (field), it's always best to explicitly refer to it using the this keyword. For example: 
class MyClass{
    private int myInt;
    
    public MyClass(int myInt){
    	this.myInt = myInt;
    }
}

Even though there is a myInt field in the class, the constructor has a completely different myInt parameter. The field (this.myInt) is then assigned the value of the parameter, so any argument passed as that parameter will initialize the myInt field in the class. 

Problem Statement:

The absolute difference between two integers , a and b, is written as |a-b|. The maximum absolute difference between two integers in a set of positive integers, elements, is the largest absolute difference between any two integers in elements.
The Difference class is started for you in the editor. It has a private integer array (elements) for storing  N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.

Task 
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the maximumDifference instance variable.

Input Format

You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in  lines of input; the first line contains , and the second line describes the  array.

Output Format

You are not responsible for printing any output; the Solution class will print the value of the maximumDifference instance variable.

Sample Input

3
1 2 5
Sample Output

4

Explanation:
|1-2| = 1
|1-5| = 4
|2-5| = 3

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    // Constructor
    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int val = 0;
        // because the difference is the absolute value
        int max = 0;
        int n = elements.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the difference
            
                if ( elements[i] < elements[j]) {
                     val = elements[j] - elements[i];
                } else {
                     val = elements[i] - elements[j];
                }
             
                //Find the max value
                if ( val > max) {
                    max = val;
                }
            }
        }
 
         maximumDifference = max;
        
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

   
