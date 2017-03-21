/*
Task:

The AdvancedArithmetic interface and the method declaration for the abstract int divisorSum(int n) method are provided for you in the editor below. Write the Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divisorSum method must be public and take an integer parameter, , and return the sum of all its divisors.

Note: Because we are writing multiple classes in the same file, do not use an access modifier (e.g.: public) in your class declaration (or your code will not compile); however, you must use the public access modifier before your method declaration for it to be accessible by the other classes in the file.

Input Format:
A single line containing an integer, n.

Sample Input

6

Sample Output
I implemented: AdvancedArithmetic
12

Explanation

The integer  is evenly divisible by 1, 2, 3, and 6. Our divisorSum method should return the sum of these numbers, which is 1 + 2 + 3 + 6= 12. The Solution class then prints "I implemented: AdvancedArithmetic"  on the first line, followed by the sum returned by divisorSum (which is 12) on the second line.

*/

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum( int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
               sum = sum + i;  
            } 
        }
        return sum;
    }
} 

class AInterface {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
