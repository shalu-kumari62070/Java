// 23. WAP to find the cube of each digits of a no. 

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();

        // Print cube in reverse order
        // while (n>0) {
        //     d = n%10;
        //     System.out.println("Cube = " + (d*d*d));
        //     n = n/10;
        // }

        // Print cube in Original sequence
        int rev = 0; 
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse Number = " + rev);
        while (rev>0) {
            d = rev%10;
            System.out.println(d + " Cube = "  + (d*d*d));
            rev = rev/10;
        }
    }
}
