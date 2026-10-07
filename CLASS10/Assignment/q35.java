// 35. WAP to find the sum of cube of even digits of a no. 

import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,sum=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            if (d%2==0) {
                sum += (d*d*d);
            }
            n = n/10;
        }
        System.out.println("sum of cube of even digits of a no = " + sum);
    }
}
