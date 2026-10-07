import java.util.Scanner;

public class CheckArmStrong {
    public static void main(String[] args) {
        int n, sum=0, temp,d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        temp = n;
        while (n>0) {
            d = n%10;
            sum = sum + (int) Math.pow(d, 3);
            n = n/10;
        }
        if (sum==temp) {
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }
    }
}
