import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, f;
        System.out.println("Enter Number = ");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if (n%i==0) {
                System.out.println("facotrs = " + i);
            }
        }
    }
}
/*
6
facotrs = 1
facotrs = 2
facotrs = 3
facotrs = 6
*/