/*

Task 
Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. 
For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
if an entry for  is not found, print Not found instead.

<Sample Input>
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

<Output>
sam=99912222
Not found
harry=12299933

*/

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Hashmap{
    public static void main(String []argh){
        Map<String,Integer> myMap = new HashMap<String,Integer>(); 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Read the values
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();    
            myMap.put(name, phone);	
        }
        while(in.hasNext()){
            String s = in.next();
            //Use containsKey
            if(myMap.containsKey(s)){
                int sval = myMap.get(s);
                System.out.println(s + "=" + sval);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
