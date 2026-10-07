// WAP to take an input using String in Scanner Class

import java.util.Scanner;

public class StringScanner1 {
    public static void main(String args[]){
        String str;
        str = "10 20 30 James 60.5 william 80 70.8 Velly 90";
        Scanner scan = new Scanner(str);
        // Printing of all Values
        System.out.println("_________OUTPUT");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}

// _________OUTPUT
// 10
// 20
// 30
// James
// 60.5
// william
// 80
// 70.8
// Velly
// 90




// Delimiter in Java
// Definition:
// A delimiter is a character or symbol used to separate different values or pieces of data.
// Hindi: Delimiter ek character ya symbol hota hai jo different values/data ko separate (alag) karta hai.
// Common Delimiters
// Space → separates words/values
// Comma , → separates values
// Semicolon ; → separates statements/values
// Colon : → separates parts
// Tab \t → separates values
