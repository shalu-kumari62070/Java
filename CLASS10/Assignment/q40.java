// 40. WAP to input a no and find the largest digits of a no (without array) 

import java.util.Scanner;

public class q40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        int largest = n%10; // last digit ko small assume kar rahe hai
        n = n/10; // ye isliye taki last digit again check na ho
        while (n>0) {
            d = n%10;
            if(d>largest){
                largest = d;
            }
            n = n/10;
        }
        System.out.println("largest Digit = " + largest);
    }
}
