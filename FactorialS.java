/*
Program for factorial
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialS {
    private static int factorial(int n)
    {
        if(n == 1){
            return 1;
        }
        return n * (factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        System.out.println(factorial(test));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
