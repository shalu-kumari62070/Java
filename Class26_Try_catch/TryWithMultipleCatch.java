// try with multiple catch

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int i, n;
        try {
            System.out.println("Enter index and element");
            i = scan.nextInt();
            n = scan.nextInt();
            ar[i] = n / i;
            System.out.println("Initialization is Completed");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Exception Array Index can be out of 0 to 9");
        } catch (ArithmeticException ae) {
            System.out.println("Exceptio: We can not / by 0");
        } catch (InputMismatchException ie) {
            System.out.println("Exception: Please Enter Integer Value only");
        }
        System.out.println("End of Program");
    }
}
