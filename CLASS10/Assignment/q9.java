// 9. WAP to print the factors, which are prime.

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        if (n<=1) {
            System.out.println("Not Prime Factor");
        }else{
            for(int i=2; i<=n; i++){
                if (n%i==0) {
                    boolean isPrime = true;
                    for(int j=2; j<= Math.sqrt(i); j++){
                        if (i%j==0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println("Prime Factor = " + i);
                    }
                }
            }
        }
        
    }
}
