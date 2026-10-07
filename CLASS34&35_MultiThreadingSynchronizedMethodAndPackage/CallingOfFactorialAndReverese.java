import java.util.Scanner;
import userpack.pack1.Reverse;
import userpack.pack1.Factorial;;
public class CallingOfFactorialAndReverese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fn, rn;
        System.out.println("Enter Number to find Factorial = " );
        fn = scan.nextInt();
        System.out.println("Enter Number to reverse the number = ");
        rn = scan.nextInt();
        Factorial f = new Factorial();
        f.fact(fn);
        Reverse r = new Reverse();
        r.revereseNumber(rn);
    }
}