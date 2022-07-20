import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nus = NumberFormat.getCurrencyInstance((Locale.US));
        String us = nus.format(payment);
        NumberFormat nindia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nindia.format(payment);
        NumberFormat nchina = NumberFormat.getCurrencyInstance((Locale.CHINA));
        String china = nchina.format(payment);
        NumberFormat nfrance = NumberFormat.getCurrencyInstance((Locale.FRANCE));
        String france = nfrance.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}