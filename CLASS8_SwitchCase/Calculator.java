import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, ch;
        System.out.println("Enter two Number = ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("1. Addition \n2. Subtraction \n3.Multiplication \n4.Division");
        System.out.println("Enter your choice = ");
        ch = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition = " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction = " + (a-b)); 
                break;
            case 3:
                System.out.println("Multiplication = " + (a*b));  
                break;
            case 4:
                System.out.println("Division = " + (a%b));  
                break;   
            default:
                System.out.println("Please enter valid number from 1 to 4");
        }

    }
}
