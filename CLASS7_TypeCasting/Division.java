import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a, b, res;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Number = ");
        a = scan.nextInt();
        b = scan.nextInt();
        if(b!=0){
            res = a/b;
            System.out.println("Division = " + res);
        }
        System.out.println("End of Program");
    }
}
