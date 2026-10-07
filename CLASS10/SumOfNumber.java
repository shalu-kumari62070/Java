import java.util.*;;
public class SumOfNumber {
    public static void main(String[] args) {
        int n,sum=0,d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        while (n>0) {
            d=n%10;
            sum+=d;
            n=n/10;
        }
        System.out.println("Sum of Digits = " + sum);
    }
}
