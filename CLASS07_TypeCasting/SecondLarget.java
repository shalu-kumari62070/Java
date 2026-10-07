// WAP to input 3 Numbers and find 2nd Largest among 3 Numbers 

import java.util.Scanner;

public class SecondLarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number");
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if ((a>b && a<c) || (a<b && a>c)) {
            System.out.println(a);
        }else if ((b>a && b<c) || (b<a && b>c)) {
            System.out.println(b);
        }else if ((c>a && c<b) || (c<a && c>b)) {
            System.out.println(c);
        }
    }
}
