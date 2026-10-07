// 38. WAP to print the factors of each digits of a no.

import java.util.Scanner;

public class q38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            for(int i=1; i<=d; i++){
                if (d%i==0) {
                    System.out.println("Factor of " + d + " = " + i);
                }
            }
            n = n/10;
        }
    }
}
