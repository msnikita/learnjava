/*
Given a 6*6   2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

a b c
  d
e f g

There are  16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values

Task 
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Input:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0


Output: 19

Explanation:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowSize = 6;
        int colSize = 6;
        int arr[][] = new int[rowSize][colSize];
        for(int i=0; i < rowSize; i++){
            for(int j=0; j < colSize; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int count = 0;
        int[] a = new int[(rowSize - 2) * (colSize -2)];
        int init_i = 0;
        int init_j = 0;
        int cnt = 0;
        int mid;
        while (init_i < rowSize + 2  && init_j < colSize + 2) {
            mid = 0;
            for (int i = init_i; i < init_i + 3; i++) {
                for (int j = init_j; j < init_j + 3; j++) {
                    if ( mid == 1  ) {
                        a[cnt] = a[cnt] + arr[i][j+1];
                        break;
                    } 
                    a[cnt] = a[cnt] + arr[i][j];
                }  
                mid = mid + 1;
            }
            
            init_j = init_j + 1;
            if (init_j >= colSize - 2) {
                if (init_i < rowSize - 3) {
                   init_j = 0;
                   init_i = init_i + 1;
                } else {
                    break;
                }
            }
           cnt = cnt + 1;    
        }
        
        int max = a[0];
        for (int i=0; i<= cnt; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
