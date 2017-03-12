/*
Testcase:
1. Convert number decimal to binary
2. Then calculate consecutive 1's  


Sample Case 1: 
The binary representation of  5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2: 
The binary representation of  13 is 1101, so the maximum number of consecutive1 's is 2.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r, out, prev;
        out = 0;
        prev = 0;
        while(n > 0) {
            r = n%2;
            n = n/2;
            
            if (r == 1) {
                prev = prev + 1;
            } else {
                prev = 0;
            } 
            if (prev > out) {
                    out = prev;
            }
            
        }
        System.out.println(out);
    }
}
