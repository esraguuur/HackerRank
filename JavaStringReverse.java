// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="";
        for(int i=A.length()-1;i>=0;i--){
            reverse=reverse+A.charAt(i);
        }
        if(reverse.equals(A)){
            System.out.print("Yes");
        }else System.out.print("No");
        
    }
}