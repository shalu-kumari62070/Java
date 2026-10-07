//  4. WAP to print the odd factor of a no. 

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0 && i%2!=0) {
                System.out.println("Odd Factor = " +i);
            }
        }
    }
}
