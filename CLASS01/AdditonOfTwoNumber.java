// Addition of Two number

import java.util.Scanner;

public class AdditonOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Sum = "+ (a+b));

        System.out.println("Enter Two number");
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println("Sum = " + (c + d));

        System.out.println("Enter two float value");
        float e = scan.nextFloat();
        float f = scan.nextFloat();
        System.out.println("Sum = " + (e + f));

        System.out.println("Enter two decimal value");
        double g = scan.nextDouble();
        double h = scan.nextDouble();
        System.out.println("Sum = " + (g + h));
    }
}


