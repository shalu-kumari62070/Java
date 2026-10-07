import java.util.Scanner;

public class q93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter number");
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            int f=1;
            for (int j = 1; j <=i; j++) {
                f = f*j;
            }
            sum +=f;
        }
        System.out.println("sum of Factorial = " + sum);

    }
}


// Enter number
// 4
// sum of Factorial = 33
