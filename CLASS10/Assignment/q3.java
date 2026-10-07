//   3. WAP to find and print of even factor. 

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0 && i%2==0) {
                System.out.println("Even Factor = " +i);
            }
        }
    }
}
