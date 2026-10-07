import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int n, sum=0,i=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        do{
            System.out.println("i = "+ i);
            sum+=i;
            i++;
        }while(i<=n);
        System.out.println("Sum = " + sum);
    }
}
