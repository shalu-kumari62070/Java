import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int d,n,count=0,rev=0,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number = ");
        n = scan.nextInt();
        temp = n;
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        if (rev==temp) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
