import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius = ");
        int r = scan.nextInt();
        System.out.println("Area of Circle = " + (Math.PI*r*r));

        System.out.println("Circumfance of Circle = " + (2*Math.PI*r*r));

    }
}
