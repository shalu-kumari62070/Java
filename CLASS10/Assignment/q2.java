//   2. WAP to find sum of factors of a number.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i = 1; i<=n; i++){
            if (n%i==0) {
                sum+=i;
                System.out.println("Factor = " + i);
            }
        }
        System.out.println("Sum of Factor = " + sum);
    }
}
