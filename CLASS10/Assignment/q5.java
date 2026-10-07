// 5. WAP to find the sum of even factors of a no.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0 && i%2==0) {
                sum+=i;
                System.out.println("Even Factor = " +i);
            }
        }
        System.out.println("Sum of Even Factors no. = " + sum);
    }
}
