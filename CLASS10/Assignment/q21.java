// 21. WAP to print the prime digits of a no.

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d, rev =0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        // reverse order me Prime digit print hoga
        // while (n>0) {
        //     d = n%10;
        //     if (d<=1) {
        //         System.out.println("Not Prime Digit");
        //     }else{
        //         boolean isPrime = true;
        //         for(int i=2; i<=Math.sqrt(d); i++){
        //             if (d%i==0) {
        //               isPrime = false;
        //               break;  
        //             }
        //         }
        //         if (isPrime) {
        //             System.out.println("Prime digit = " + d);
        //         }
        //     }
        //     n = n/10;
        // }


        // original sequence mein prime digit print hoga
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        while (rev>0) {
            d = rev%10;
            if (d<=1) {
                System.out.println("Not Prime Digit");
            }else{
                boolean isPrime = true;
                for(int i=2; i<=Math.sqrt(d); i++){
                    if (d%i==0) {
                      isPrime = false;
                      break;  
                    }
                }
                if (isPrime) {
                    System.out.println("Prime digit = " + d);
                }
            }
            rev = rev/10;
        }
        

    }
}
