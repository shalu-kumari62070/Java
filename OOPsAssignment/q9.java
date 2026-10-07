/*
9.0 A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter a new value.
*/

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, temp, rev=0, d;
        System.out.println("Enter Five digit Number");
        num = scan.nextInt();
        if (num < 10000 || num > 99999){
            System.out.println("Enter valid number");
        }
        temp = num;
        while (num>0) {
            d = num%10;
            rev = rev*10 + d;
            num = num/10;
        }
        if (temp == rev) {
            System.out.println("It is Plaindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }
}