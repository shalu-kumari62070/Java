// 11. WAP to count the no of odd factors of a no. 

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter Number");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if (i%2!=0) {
                    count++;   
                }
            }
        }
        System.out.println("Count = " + count);
    }
}
