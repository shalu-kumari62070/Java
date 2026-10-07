import java.util.Scanner;

public class ReverseAndCountNumber {
    public static void main(String[] args) {
        int d,n,count=0,rev=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number = ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            System.out.println("d = " + d);
            count++;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse Number = " + rev);
        System.out.println("count = " + count);
    }
}
