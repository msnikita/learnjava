/*
 Task 
Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com

Input: 

The first line contains an integer, N, total number of rows in the table. 
Each of the N subsequent lines contains 2 space-separated strings denoting a person's first name and email ID, respectively.

Output Format

Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class PatternRegx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRgx = ".+@gmail\\.com$";
        /*
         * matches() tries to match the expression against the entire 
         * string and implicitly add a ^ at the start and  $
         *
         * find() tries to find a substring that matches the pattern        
         */
        Pattern pattern = Pattern.compile(emailRgx);
        List<String> list = new ArrayList();
        for(int a0 = 0; a0 < N; a0++){            
            String firstName = in.next();
            String emailID = in.next();
            /*
             * Using matcher will store only one entry for julia@gmail.com
             */
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}


