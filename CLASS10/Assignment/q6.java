// 6. WAP to find sum of odd factors of a no. 

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0 && i%2!=0) {
                sum+=i;
                System.out.println("Odd Factor = " +i);
            }
        }
        System.out.println("Sum of Odd Factors no. = " + sum);
    }
}
