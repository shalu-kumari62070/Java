// 29. WAP to count how many odd digits are there in a no. 

import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,count=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            if (d%2!=0) {
                count++;
            }
            n = n/10;
        }
        System.out.println("Odd Digit no count = " + count);
    }
}
