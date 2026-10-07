// 31. WAP to find the sum of square of each digits of a no. 

import java.util.Scanner;

public class q31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,sum=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            sum = sum + (d*d);
            n = n/10;
        }
        System.out.println("sum of square of each digits of a no = "+ sum);
    }
}
