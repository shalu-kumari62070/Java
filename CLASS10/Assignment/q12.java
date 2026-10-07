// 12. WAP to count the no of prime factors of a no. 

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        if (n<=1) {
            System.out.println("No Prime Factor");
        }else{
            for(int i=2; i<=n; i++){
                if (n%i==0) {
                    boolean isPrime = true;
                    for(int j=2; j<=Math.sqrt(i); j++){
                        if (i%j==0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        count++;
                    }
                }
            }
            System.out.println("Count = " + count);
        }
    }
}
