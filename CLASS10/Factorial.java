import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f=1, num;
        System.out.println("Enter Number = ");
        num = scan.nextInt();
        for(int i=1; i<=num; i++){
            f = f *i;
        }
        System.out.println("Factorial = " + f);
        
    }
}
