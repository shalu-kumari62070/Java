// 19. WAP to find the sum of digits of a no. 

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum=0, d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            sum+=d;
            n = n/10;
        }
        System.out.println("Sum = " + sum);
    }
}
