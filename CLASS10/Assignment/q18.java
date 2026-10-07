// 18. WAP to input a no and cheek whether it is palindrome or not. 

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, rev=0, d, temp;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        temp = n;
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse of the number = " + rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
