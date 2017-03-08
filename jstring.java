
Input Format

The first line contains an integer,  (the number of test cases). 
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format
T: no of testcases
For each String Sj  (where 0<=T-1 ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       
        int gap=in.nextInt();
        gap = gap -1;
      
        for (int j=0; j<=gap; j++) {
            String stri=in.next();    
            String str2= new String();
            String str3 =new String();
            int str_len =stri.length();
        
            for (int i=0; i<str_len; i++) {
                if (i%2 == 0) {
                    str2=str2.concat(String.valueOf(stri.charAt(i)));
                } else {
                    str3=  str3.concat(String.valueOf(stri.charAt(i)));      
                }
            }
    
            System.out.print(str2);
            System.out.printf("%" + gap+"s" , "");
            System.out.println(str3);
            stri="";
            str2="";
            str3="";
            str_len=0;
        }
        
    }
}
