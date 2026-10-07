// 1.   WAP to find the factor of a Number.  

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0) {
                System.out.println("i = " + i);
            }
        }
    }
}
