// catch with Exception class can catch all types of Exception

import java.util.Scanner;

public class TryWithOneCatchException {
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
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
