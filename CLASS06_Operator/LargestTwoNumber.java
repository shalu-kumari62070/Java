import java.util.Scanner;

public class LargestTwoNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a , b, res;
        System.out.println("Enter two number ");
        a = scan.nextInt();
        b = scan.nextInt();

        res = (a>b) ? a : b;
        System.out.println("Largest value = " + res);
    }
}
