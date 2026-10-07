// 14. WAP to find the factorial of a no. 

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        int n, f=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factorial of Number = " + f);
    }
}
