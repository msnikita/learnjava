/*

You are given an integer N. Print the factorial of this number.
	N!= N*(N-1)*(N-2)*...*3*2*1
Input 
Input consists of a single integer N, where 1<=N <=100.

Output 
Print the factorial of N.

Example 
For an input of 25, you would print 155112100.........

Note: Factorials of N>20 can't be stored even in a 64 -bit  long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        BigInteger sum = BigInteger.valueOf(1);
        for(int i = 2; i <= n; i++) {
           sum =  sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
    
}
