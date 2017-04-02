/*
Task: 
Given set S={1,2,3,....N}. Find two integers, A and B (where A<B), from set S such that the value of A&B is the maximum possible and    also less than a given integer, K. In this case,  represents the bitwise AND operator.

Input Format: 
The first line contains an integer, T, the number of test cases. 
Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.

Output Format
For each test case, print the maximum possible value of  on a new line.

Sample Input

3
5 2
8 5
2 2

Sample Output

1
4
0

Explanation

N = 5, K = 2 S = {1,2,3,4,5}
All possible values of A and B are:

A<B conditions...

1. A =1 B=2 A&B=0
2. A=1 B =3  A&B=1
3. A =1 B=4 A&B=0
4. A=1 B=5 A&B=1
5. A=2 B=3 A&B=2
6. A=2 B=4 A&B=0
7. A=2 B=5 A&B=0
8. A=3 B=4 A&B=0
9. A=3 B=5 A&B =1
10. A=4 B=5 A&B=4
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MasterBitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();            
            /*
             * master piece solution which I have used from the Jekus'discussions forums
             * This teaches us to look at the patterns and then design the solution
             */
            if ((k-1 | k) <= n) {
                System.out.println(k-1);
            } else {
                System.out.println(k-2);
            }            
        }
    }
}
