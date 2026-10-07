// WAP to input a number and check that it is +ve or -ve or 0.

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num = scan.nextInt();
        if (num>0) {
            System.out.println("Number is Positive " + num);
        }else if (num<0) {
            System.out.println("Number is Negative " + num);
        }else if (num==0) {
            System.out.println("Number is Zero " + num);
        }
    }
}
