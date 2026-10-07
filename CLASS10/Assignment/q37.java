// 37. WAP to count the no of factors of a no. 

import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,count=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0) {
                count++;
            }
        }  
        System.out.println("count the no of factors of a no = " + count);
    }
}
