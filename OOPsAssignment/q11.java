/*
11.0 The factorial of a nonnegative integer n is written as n! (Pronounced ―n factorial‖) and is
defined as follows: n!=n ·(n – 1) · (n – 2) · … · For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
a) Write an application that reads a non-negative integer and computes and prints its factorial.
b) Write an application that estimates the value of the mathematical constant e by using the
following formula. Allow the user to enter the number of terms to calculate.
c) Write an application that computes the value of ex by using the following formula. Allow the
user to enter the number of terms to calculate.1
*/

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, term, f = 1;
        double e = 1.0;

        // (a) factorial
        System.out.println("Enter non negative number");
        n = scan.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("Factorial of " + n + " = " + f);
        }

        // 11(b) Calculate e
        System.out.println("Enter the number of terms to calculate e = ");
        term = scan.nextInt();
        for (int i = 1; i <= term; i++) {
            e = e + 1.0 / (f * i);
        }
        System.out.println("e = " + e);

    }
}
