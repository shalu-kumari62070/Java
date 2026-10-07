// 24. WAP to print the factorial of each digits of a no.

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();

        // Print factorial in reverse order
        while (n>0) {
            d = n%10;
            int f=1;
            for(int i=1; i<=d; i++){
                f = f*i;
            }
            System.out.println("Factorial of " + d + " = " + f);
            n = n/10;
        }
    }
}
