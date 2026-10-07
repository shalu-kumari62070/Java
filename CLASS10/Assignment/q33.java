// 33. WAP to find the sum of factorial of each digits of a no.

import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,sum=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            int f = 1;
            for(int i=1; i<=d; i++){
                f = f*i;
            }
            sum +=f;
            n = n/10;
        }
        System.out.println("sum of Factorial of each digits of a no = "+ sum);
    }
}
