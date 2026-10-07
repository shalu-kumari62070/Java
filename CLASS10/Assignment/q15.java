// 15. WAP to input x and y and find the value of xy 

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the value of x = ");
        x = scan.nextInt();
        System.out.println("Enter the Value of y = ");
        y = scan.nextInt();
        System.out.println("x^y = " + Math.pow(x, y));
    }
}
