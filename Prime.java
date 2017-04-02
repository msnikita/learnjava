/*
  * Print if the no is prime or not prime.
  * And try to come up with a O(sqrt(n)) primary algorithm 
  *
  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        int p;
        
        Scanner in = new Scanner(System.in);
        /*
         * Input
         */
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
             a[i] = in.nextInt();
        }
           
        for (int i=0; i<n; i++) {
            p = 1;
           
            for(int j = 2; j*j<=a[i]; j++) {            
                if (a[i]%j == 0) {
                    p = 0;
                    break;
                }
            }
            if (a[i] == 1) {
                System.out.println("Not prime");
                
            } else {
                if (p == 0) {
                    System.out.println("Not prime");               
                } else {
                    System.out.println("Prime");
                }
            }
        }
    }
}
