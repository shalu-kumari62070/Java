// 17. WAP to input a no and print the no in reverse order. 

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, rev=0, d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse of the number = " + rev);
    }
}
