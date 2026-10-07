// 16 WAP to input the no and find the length of the no. (Count the digits) 

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count=0, d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            count++;
            n = n/10;
        }
        System.out.println("length of the number = " + count);
    }
}
