// Wap to input 3 number and find largest among 3 numbers using Ternary Operator

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, res;
        System.out.println("Enter Three Number = ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        // res = (a>b && a>c) ? a : (b>a && b>c) ? b :c;
        res = (a>b) ? ((a>c) ? a : c) : ((b>c)? b :c) ;
        System.out.println("Largest "+res);
        

    }
}
