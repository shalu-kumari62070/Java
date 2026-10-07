// 20. WAP to find the sum of first and last digits of a no. 

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, lastnum;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        lastnum = n%10;
        while (n>10) {
            n = n/10;
            System.out.println(n);
        }
        System.out.println("SUM of First and Last Digit = " + (lastnum + n));
    }
}
