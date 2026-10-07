// 22. WAP to find the square of each digits of no. 

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();

        // Print square in reverse order
        // while (n>0) {
        //     d = n%10;
        //     System.out.println("Square = " + (d*d));
        //     n = n/10;
        // }

        // Print square in Original sequence
        int rev = 0;
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse Number = " + rev);
        while (rev>0) {
            d = rev%10;
            System.out.println(d + " Square = "  + (d*d));
            rev = rev/10;
        }
    }
}
