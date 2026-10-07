// 7. WAP to input a no and cheek whether it is perfect on not. (Sum of factor of a no excluding the no is equal to the no) 

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter number = ");
        n = scan.nextInt();
        for(int i=1; i<n; i++){
            if (n%i==0) {
                sum+=i;
                System.out.println("Factor = " + i);
            }
        }
        if (sum==n) {
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
