// 8. WAP to input a no and cheek whether it is prime are not. (Number which has two factors one and no itself) 

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count=0;
        boolean isPrime = true;
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        // if (n<=1) {
        //     System.out.println("Not Prime number ");
        // }
        // else{
        //     for(int i=1; i<=n; i++){
        //         if (n%i==0) {
        //             count++;
        //         }
        //     }
        //     if (count==2) {
        //     System.out.println("Prime Number");
        //     }else{
        //         System.out.println("Not Prime Number");
        //     }
        // }

        // or
        if (n<=1) {
            isPrime = false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if (n%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }

    }
}
