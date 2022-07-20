// "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

// This exercise is to test your understanding of Java Strings. A sample String declaration:

// String myString = "Hello World!"
// The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

// Given two strings of lowercase English letters,  and , perform the following operations:

// Sum the lengths of  and .
// Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
// Capitalize the first letter in  and  and print them on a single line, separated by a space.
// Input Format

// The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

// Output Format

// There are three lines of output:
// For the first line, sum the lengths of  and .
// For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
// For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        B= B.substring(0, 1).toUpperCase() + B.substring(1);
        A= A.substring(0, 1).toUpperCase() + A.substring(1);
        System.out.println(A.length()+ B.length());
        int retvalA=A.compareTo(B);  
        int retvalB=B.compareTo(A);  
        if(retvalA>retvalB){
            System.out.println("Yes");
        }
        else{System.out.println("No");}
        System.out.println(A + ' ' + B);
        
    }
}